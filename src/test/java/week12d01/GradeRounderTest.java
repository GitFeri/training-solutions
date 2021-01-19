package week12d01;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GradeRounderTest {

    @Test
    void roundGrades() {

        assertEquals(Arrays.toString(new int[]{13, 20, 39, 40, 40, 45}),
                Arrays.toString(new GradeRounder().roundGrades(new int[]{13, 20, 39, 41, 42, 43})));

        assertEquals(Arrays.toString(new int[]{}),
                Arrays.toString(new GradeRounder().roundGrades(new int[]{})));

        assertEquals(Arrays.toString(new int[]{38,39,40,40,40,45,45,45}),
                Arrays.toString(new GradeRounder().roundGrades(new int[]{38,39,40,41,42,43,44,45})));

        int[] test = {54};
        new GradeRounder().roundGrades(test);
        assertEquals(Arrays.toString(new int[]{54}),Arrays.toString(test));



    }
}