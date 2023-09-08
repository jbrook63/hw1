/*
 * CS2050 - Computer Science II - Fall 2023
 * Instructor: Thyago Mota
 * Student:
 * Description: Homework 01 - QuadraticEquation
 */

public class QuadraticEquation {
    public static final double PRECISION = 0.00001;
    private double a;
    private double b;
    private double c;

        public QuadraticEquation(double a, double b, double c) throws IllegalArgumentException {
            if (Math.abs(a) < PRECISION) {
                throw new IllegalArgumentException("Coefficient 'a' should not be close to zero.");
            }
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        public double getC() {
            return c;
        }

        private double calculateDelta() {
            return b * b - 4 * a * c;
        }

        public boolean hasRoots() {
            double delta = calculateDelta();
            return delta >= 0;
        }

        public double firstRoot() throws IllegalStateException {
            double delta = calculateDelta();
            if (delta < 0) {
                throw new IllegalStateException("No real roots available (delta < 0).");
            }
            return (-b + Math.sqrt(delta)) / (2 * a);
        }
        public double secondRoot() throws IllegalStateException {
            double delta = calculateDelta();
            if (delta < 0) {
                throw new IllegalStateException("No real roots available (delta < 0).");
            }
            return (-b - Math.sqrt(delta)) / (2 * a);
        }
    }
