package activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ActivityDaoTest {

    ActivityDao activityDao;

    @BeforeEach
    public void init() {

        MariaDbDataSource dataSource;

        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activityTracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");

        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection failed!", sqlException);
        }

        Flyway flyway = Flyway.configure().locations("/db/migration/activity").dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        activityDao = new ActivityDao(dataSource);
    }

    @Test
    public void setlectAllTest() {
        assertEquals(3, activityDao.selectAllActivities().size());
    }

    @Test
    public void insertActivityTest() {
        Activity activity = new Activity(LocalDateTime.of(2021, 2, 23, 10, 22), "Biking in Bakony", ActivityType.BIKING);
        activityDao.insertActivity(activity);
        assertEquals(4, activityDao.selectAllActivities().size());
    }

    @Test
    public void setlectDateTest() {
        assertEquals(2, activityDao.selectActivitiesBeforeDate(LocalDate.of(2020, 2, 1)).size());
    }

    @Test
    public void findByIdTest() {
        Activity activity = new Activity(LocalDateTime.of(2021, 2, 1, 0, 0), "akármi", ActivityType.BIKING);
        Activity result = activityDao.insertActivity(activity);

        assertEquals("akármi", activityDao.selectActivityById(result.getId()).getDesc());
    }
}