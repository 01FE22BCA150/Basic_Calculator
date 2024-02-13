/**
 * The Calculator class performs basic arithmetic operations such as addition, subtraction,
 * multiplication, and division.
 */
class Calculator extends ExtendedClass{

    float addition(float  operand_1, float operand_2){
        return(operand_1 + operand_2);
    }
    float substraction(float  operand_1, float operand_2){
        return(operand_1 - operand_2);
    }
    float multiplication(float  operand_1, float operand_2){
        return(operand_1 * operand_2);
    }
    float division(float  operand_1, float operand_2){
        return(operand_1 / operand_2);
    }
    float square(float operand_1){
        return(operand_1*operand_1);
    }

    public static void main(String[] args) {
        Calculator calc=new Calculator();
        float operand_1 = 8;
        float operand_2 = 4;
       float add_result = calc.addition(operand_1, operand_2);
       System.out.println("Addition of two numbers="+add_result);
       float sub_result = calc.substraction(operand_1, operand_2);
       System.out.println("Substraction of two numbers="+sub_result);
       float mult_result = calc.multiplication(operand_1, operand_2);
       System.out.println("Multiplication of two numbers="+mult_result);
       float div_result = calc.division(operand_1, operand_2);
       System.out.println("Division of two numbers="+div_result);
       float sq_result = calc.square(operand_1);
       System.out.println("Squaring of a number="+sq_result);

       float square_result = calc.square();
       System.out.println("Squared no.="+square_result);
       float cube_result= calc.cube(5);
       System.out.println("Cube no.="+cube_result);
       float mod_result= calc.mod(10, 20);
       System.out.println("Modulus of a number="+mod_result);
    }

}



