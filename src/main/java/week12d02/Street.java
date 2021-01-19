package week12d02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Street {

    private List<Site> sites = new ArrayList<>();

    public void sellSite(Site site) {
        sites.add(site);
    }

    public int lastSold() {
        int even = 0;
        int odd = -1;

        for (Site s : sites) {
            if (s.getSide() == 0) {
                even += 2;
            } else {
                odd += 2;
            }
        }
        if (sites.get(sites.size() - 1).getSide() == 0) {
            return even;
        } else {
            return odd;
        }
    }

    private int[] fenceStatisticArray() {

        int[] result = new int[Fence.values().length];

        for (Site site : sites) {
            result[site.getFence().getValue()]++;
        }

        return result;
    }

    public List<FenceTypes> fenceStatistic() {
        int[] result = fenceStatisticArray();

        List<FenceTypes> fenceTypes = new ArrayList<>();
        for (Fence fence : Fence.values()) {
            fenceTypes.add(new FenceTypes(result[fence.getValue()], fence));
        }

        return fenceTypes;
    }

}