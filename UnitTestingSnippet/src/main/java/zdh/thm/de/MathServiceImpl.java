package zdh.thm.de;

public class MathServiceImpl implements MathService{

        @Override
        public int add(int a, int b) {
            return a+b;
        }

        @Override
        public int subtract(int a, int b) {
            return a-b;
        }

        @Override
        public int multiply(int a, int b) {
            return a*b;
        }

        @Override
        public int divide(int a, int b) throws ArithmeticException {
            return a / b;
        }

        @Override
        public int square(int a) {
            return a*a;
        }
}
