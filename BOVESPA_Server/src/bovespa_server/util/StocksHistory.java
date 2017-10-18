/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bovespa_server.util;

/**
 *
 * @author alinekborges
 * This class only have the history of all stocks for cleaner separation
 */
public class StocksHistory {
    
    public static Double[] EMBR3 = {18.01 , 18.00 , 18.04 , 18.15 , 18.16 , 18.54 , 18.56 , 18.60 , 18.49 , 18.69 , 18.50 , 18.29 , 18.32 , 18.25 , 17.69 , 17.67 , 17.90 , 17.93 , 17.85 , 17.75 , 17.05 , 17.05 , 17.32 , 17.10 , 17.12 , 16.63 , 16.56 , 16.82 , 17.02 , 16.96 , 16.76 , 16.58 , 16.57 , 16.96 , 16.66 , 16.29 , 16.05 , 15.59 , 15.64 , 15.71 , 15.77 , 15.65 , 15.84 , 15.55 , 15.62 , 15.64 , 15.60 , 15.50 , 15.36 , 15.28 , 15.51 , 15.49 , 15.57 , 15.55 , 15.92 , 15.70, 15.46 , 15.45 , 15.70 , 15.26 , 15.20 , 15.13 , 15.06 , 15.03 , 15.00 , 15.55 , 15.83 , 15.92 , 15.69 , 15.75 , 16.13 , 15.42 , 15.78 , 15.87 , 15.69 , 15.58 , 15.90 , 16.00 , 15.87 , 16.08 , 16.24 , 15.99 , 16.01 , 16.65 , 16.30 , 16.48 , 16.76 , 16.37 , 15.98 , 16.21 , 15.15 , 15.40 , 15.00 , 15.79, 15.97 , 15.81 , 15.79 , 15.73 , 15.43 , 15.10 , 15.08 , 15.15 , 15.29 , 14.76 , 15.36 , 15.16 , 15.33 , 15.37 , 15.63 , 15.69 , 15.70 , 15.83 , 15.80 , 16.66 , 16.83 , 17.01 , 17.35 , 17.30 , 16.85 , 17.14 , 17.01 , 17.39 , 17.49 , 17.58 , 17.75 , 17.60};
    public static Double[] PETR4 = {16.01,15.59,15.54,15.85,15.65,15.52,15.06,15.30,15.22,15.11,15.56,15.70,15.43,15.58,15.07,14.92,14.98,14.99,15.02,14.81,14.86,14.81,14.69,14.51,14.23,13.94,13.82,13.47,13.44,13.68,13.76,13.81,13.68,13.65,13.64,13.28,13.16,13.02,13.10,13.05,12.91,12.94,13.15,13.44,13.46,13.33,13.26,13.31,13.08,13.08,13.07,12.91,13.00,12.98,13.01,12.77,12.67,13.03,12.97,12.83,12.87,12.91,12.80,12.51,11.90,11.74,11.85,12.08,12.12,12.32,12.22,12.19,12.09,12.01,12.13,12.04,11.87,11.72,11.59,11.76,12.22,12.21,12.61,12.77,12.77,12.83,12.71,12.81,13.03,12.92,12.68,12.82,12.95,13.36,13.55,13.40,13.63,13.69,13.38,13.00,13.46,12.45,15.51,15.52,15.65,15.35,14.64,14.31,14.04,13.98,13.66,13.58,13.95,13.85,13.69,13.56,14.00,13.80,13.92,13.63,13.55,13.95,13.97,14.08,14.58,14.55};
    public static Double[] CSNA3 = {9.89,9.70,10.16,10.44,10.41,9.99,9.64,9.22,8.92,9.02,9.43,9.26,9.70,10.07,10.43,10.71,10.81,10.33,10.07,10.29,10.50,10.16,9.78,9.49,9.46,9.16,8.78,8.57,8.44,8.36,8.41,8.46,8.29,7.87,8.02,7.92,8.10,8.01,8.05,8.14,8.31,7.97,8.04,8.37,8.37,7.99,7.59,7.50,7.43,7.48,7.62,7.31,7.26,7.43,7.71,7.40,7.36,7.55,7.67,7.52,7.78,7.70,7.68,7.66,7.34,7.16,7.07,6.92,6.97,7.11,7.20,6.77,6.83,6.94,6.67,6.43,6.30,6.08,5.98,5.97,6.11,6.24,6.40,6.40,6.45,6.57,6.24,6.45,6.52,6.60,6.70,6.65,6.86,7.10,6.91,6.90,6.78,6.88,6.80,6.51,6.63,6.37,7.39,7.60,7.28,7.23,7.36,7.41,7.20,7.14,7.01,7.02,7.57,7.75,7.63,7.52,7.57,7.27,7.33,7.16,7.05,7.28,7.36,7.28,7.66,8.10}; 
    public static Double[] PTBL3 = {5.40,5.38,5.22,5.33,5.22,5.16,5.11,5.05,4.85,4.86,4.85,4.90,4.89,4.84,4.83,4.86,4.94,4.86,4.87,4.73,4.72,4.82,4.68,4.45,4.34,4.34,4.13,4.09,4.10,4.04,4.10,4.09,4.10,4.09,4.09,4.08,4.10,4.07,3.99,3.91,3.78,3.76,3.71,3.72,3.81,3.86,3.72,3.70,3.72,3.72,3.75,3.67,3.67,3.56,3.65,3.61,3.45,3.44,3.40,3.45,3.45,3.35,3.32,3.32,3.32,3.35,3.29,3.13,3.13,3.13,3.10,3.10,3.08,3.09,3.07,3.15,3.16,3.11,3.11,3.26,3.31,3.31,3.31,3.30,3.22,3.35,3.33,3.31,3.32,3.31,3.31,3.34,3.37,3.46,3.49,3.39,3.32,3.11,3.10,2.93,3.15,2.88,3.61,3.77,3.83,3.60,3.54,3.35,3.29,3.12,2.97,2.90,3.00,2.92,2.80,2.78,2.75,2.77,2.78,2.73,2.70,2.70,2.70,2.66,2.73,2.72};
    public static Double[] ITSA4 = {11.23,11.10,11.22,11.35,11.18,10.97,10.91,10.86,10.78,10.80,10.99,10.94,11.07,11.07,10.96,11.08,11.15,10.93,10.88,10.83,10.83,10.77,10.61,10.46,10.33,10.32,10.24,10.11,10.28,10.18,10.25,10.21,10.21,10.03,9.97,9.85,9.81,9.75,9.77,9.88,9.76,9.64,9.62,9.69,9.77,9.62,9.56,9.62,9.51,9.36,9.20,9.17,9.17,9.16,9.21,9.17,9.18,9.16,9.13,9.13,9.12,9.14,9.18,9.04,9.00,8.98,8.92,8.94,9.01,9.00,8.99,8.95,8.78,8.73,8.73,8.71,8.67,8.70,8.71,8.73,8.97,8.86,8.87,8.81,8.66,8.80,8.90,8.94,8.77,8.70,8.73,8.73,8.88,8.97,8.87,8.87,8.76,9.01,8.95,8.81,9.10,8.53,9.99,10.21,10.24,10.27,10.12,10.02,9.96,9.92,9.76,9.70,9.93,9.90,9.70,9.69,9.59,9.52,9.49,9.36,9.48,9.49,9.34,9.30,9.51,9.47};
    public static Double[] NATU3 = {31.34,30.78,30.74,31.51,31.87,30.61,30.51,31.05,30.92,30.35,30.84,31.09,31.26,31.77,32.70,33.26,34.28,33.66,32.67,32.40,31.42,30.14,29.81,29.50,29.45,29.22,29.31,29.41,29.61,29.09,29.08,28.90,29.03,28.07,27.94,27.45,26.67,26.04,26.41,26.40,25.40,25.07,24.96,24.70,25.26,25.64,25.61,24.61,24.65,24.60,24.52,24.15,22.88,22.19,22.58,23.17,23.76,23.81,23.71,23.46,23.61,24.50,24.83,24.83,24.55,24.80,24.69,25.13,25.01,24.93,25.15,25.57,25.40,25.76,25.06,26.05,26.55,26.69,27.13,27.40,28.00,27.79,28.13,28.73,29.34,29.72,32.00,31.82,32.35,32.30,32.42,32.63,32.44,33.12,32.76,32.77,32.22,32.09,31.07,30.52,30.75,29.15,33.96,34.85,34.80,34.65,34.80,33.27,32.19,31.51,31.30,31.05,30.80,30.23,29.72,29.51,30.85,31.15,30.51,30.37,30.41,30.57,29.85,29.76,30.14,29.60};
    
    public static Double[] historyFrom(String name) {
        switch(name) {
            case "EMBR3":
                return EMBR3;
            case "PETR4":
                return PETR4;
            case "CSNA3":
                return CSNA3;
            case "PTBL3":
                return PTBL3;
            case "ITSA4":
                return ITSA4;
            case "NATU3":
                return NATU3;
        }
        
        return EMBR3;
    }
    
}
