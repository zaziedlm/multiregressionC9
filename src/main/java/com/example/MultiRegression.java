package com.example;

import java.util.Arrays;

import org.apache.commons.math3.stat.regression.OLSMultipleLinearRegression;

/**
 * MultiRegression
 *
 */
public class MultiRegression 
{
    public static void main( String[] args )
    {
        double[] y = new double[] {197,  237.1,  282.3,  322.3,  362.8,  392.5,  418.9,  446.6,  443,  329.8,  287.1,  269.4};
        double[][] x = new double[y.length][];

        int idx = 0;
        x[idx++] = new double[]{361.0 , 19.0};
        x[idx++] = new double[]{529.0 , 23.0};
        x[idx++] = new double[]{756.3 , 27.5};
        x[idx++] = new double[]{1056.3 , 32.5};
        x[idx++] = new double[]{1406.3 , 37.5};
        x[idx++] = new double[]{1814.8 , 42.6};
        x[idx++] = new double[]{2256.3 , 47.5};
        x[idx++] = new double[]{2745.8 , 52.4};
        x[idx++] = new double[]{3294.8 , 57.4};
        x[idx++] = new double[]{3881.3 , 62.3};
        x[idx++] = new double[]{4515.8 , 67.2};
        x[idx++] = new double[]{5329.0 , 73.0};

        // 重回帰分析のため、インスタンス生成
        OLSMultipleLinearRegression reg = new OLSMultipleLinearRegression();
        // データのセット
        reg.newSampleData(y, x);

        // 推定したパラメータを表示
        System.out.println("定数項：" +
            Arrays.toString(reg.estimateRegressionParameters())
        );

    }
}
