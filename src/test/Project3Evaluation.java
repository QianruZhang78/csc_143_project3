package test;

import lib.TestRunner;

public class Project3Evaluation {
    public static void main(String[] args) {
        int totalTests = 15;
        int bonusTests = 1;

        System.out.println("BEGIN PROJECT 3 EVALUATION");
        System.out.println("Total base tests: " + totalTests);
        System.out.println("Tests needed for 100%: " + (totalTests - bonusTests));
        System.out.println("==========================");
        System.out.println();

        int testsRun = 0;
        int testsPassed = 0;
        boolean allPassed = true;

        TestRunner.TestResults binaryTreeResult = TestRunner.runTest(BinaryTreeTest.class);
        System.out.println(binaryTreeResult.toString());
        allPassed = allPassed && binaryTreeResult.allPassed();

        testsRun += binaryTreeResult.testCount;
        testsPassed += binaryTreeResult.successCount;

        TestRunner.TestResults treeResult = TestRunner.runTest(TreeTest.class);
        System.out.println(treeResult.toString());
        allPassed = allPassed && treeResult.allPassed();

        testsRun += treeResult.testCount;
        testsPassed += treeResult.successCount;

        if (testsRun < totalTests) {
            System.out.printf("Note: %d tests were excluded from evaluation.\n", totalTests - testsRun);
        }

        long score = Math.round(Math.floor(((double)(testsPassed) / (double)(totalTests - 1)) * 100));
        if (testsRun == totalTests && allPassed) {
            System.out.println("!!! ALL PROJECT TESTS PASSED! GREAT JOB !!!");
            score = 110;
        } else {
            System.out.printf("Only %d tests are required to pass to receive a score of 100%%.\n", totalTests - bonusTests);
            System.out.printf("10 bonus points are available if all %d tests pass, for a total of 110%%.\n", totalTests);
            System.out.println();
        }

        System.out.printf("Project Tests Passed: [%d / %d]\n", testsPassed, testsRun);
        System.out.printf("Project Score: %d%%\n", score);
    }
}
