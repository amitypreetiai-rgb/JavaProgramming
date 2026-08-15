package Module1;

class MathOperation {
    String operationName;
    
    MathOperation(String operationName) { 
        this.operationName = operationName; 
    }
    
    double calculateResult() { 
        return 0; 
    }
}

class Addition extends MathOperation {
    double num1, num2;
    
    Addition(String operationName, double num1, double num2) {
        super(operationName);
        this.num1 = num1;
        this.num2 = num2;
    }
    
    @Override
    double calculateResult() { 
        return num1 + num2; 
    } 
}

class Division extends MathOperation {
    double dividend, divisor;
    
    Division(String operationName, double dividend, double divisor) {
        super(operationName);
        this.dividend = dividend;
        this.divisor = divisor;
    }
    
    @Override
    double calculateResult() { 
        return dividend / divisor; 
    } 
}

public class Q2 {
    public static void main(String[] args) {
        MathOperation[] operations = {
            new Addition("Addition", 50, 50),
            new Division("Division", 50, 50)
        };
        
        for (MathOperation op : operations) {
            System.out.println(op.operationName + " -> Result: " + op.calculateResult());
        }
    }
}
