package week12d02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreetTest {
    Street street = new Street();

    @BeforeEach
    public void SetUp() {
        street.sellSite(new Site(0, 10, Fence.PERFECT));
        street.sellSite(new Site(0, 7, Fence.NEED_UPGRADE));
        street.sellSite(new Site(1, 12, Fence.NEED_UPGRADE));
        street.sellSite(new Site(0, 9, Fence.PERFECT));
        street.sellSite(new Site(0, 11, Fence.NO_FENCE));
        street.sellSite(new Site(1, 13, Fence.PERFECT));
    }


    @Test
    void lastSoldTest() {
        assertEquals(3, street.lastSold());
    }

//    @Test
//    void fenceStatisticArrayTest() {
//        assertEquals("[3, 2, 1]", Arrays.toString(street.fenceStatisticArray()));
//    }

    @Test
    void fenceStatisticTest() {
        List<FenceTypes> fenceTypes = new ArrayList<>(street.fenceStatistic());
        int sumOfFence;
        for (FenceTypes fence : fenceTypes) {
            switch (fence.getFence()) {
                case PERFECT:
                    sumOfFence = 3;
                    break;
                case NEED_UPGRADE:
                    sumOfFence = 2;
                    break;
                case NO_FENCE:
                    sumOfFence = 1;
                    break;
                default: sumOfFence = 0;
            }
            assertEquals(sumOfFence, fence.getNum());
        }
    }
}
