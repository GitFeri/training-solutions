package activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {
    DataSource dataSource;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insertActivity(Activity activity) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("insert into activities(start_time,activity_desc,activity_type) values (?,?,?)")) {

            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getType().toString());
            stmt.execute();

        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection failed!", sqlException);
        }
    }

    public List<Activity> selectAllActivities() {
        List<Activity> result = new ArrayList<>();
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities");
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Activity activity = new Activity(
                        rs.getLong("id"),
                        rs.getTimestamp("start_time").toLocalDateTime(),
                        rs.getString("activity_desc"),
                        ActivityType.valueOf(rs.getString("activity_type")));
                result.add(activity);
            }
            return result;
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection failde", sqlException);
        }
    }

    public List<Activity> selectAllActivityByPreparedStatement(PreparedStatement stmt) {
        List<Activity> result = new ArrayList<>();
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Activity activity = new Activity(
                        rs.getLong("id"),
                        rs.getTimestamp("start_time").toLocalDateTime(),
                        rs.getString("activity_desc"),
                        ActivityType.valueOf(rs.getString("activity_type")));
                result.add(activity);
            }
            return result;
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection faile", sqlException);
        }
    }


    public Activity selectActivityById(long id) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities where id = ?")) {

            stmt.setLong(1, id);
            List<Activity> result = selectAllActivityByPreparedStatement(stmt);

            if (result.size() == 1) {
                return result.get(0);
            }
            throw new IllegalArgumentException("Wrong id!");
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection failde", sqlException);
        }
    }

    public List<Activity> selectActivitiesByType(ActivityType type) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities where activity_type = ?")) {

            stmt.setString(1, type.toString());
            return selectAllActivityByPreparedStatement(stmt);
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection failed!", sqlException);
        }
    }
}