class Complex{
    double real; 
    double imag;
    Complex add(Complex c){
        Complex answer = new Complex();
        answer.real = c.real + this.real;
        answer.imag = c.imag + this.imag;
        return answer;
    }
    public static void main(String[] args){
        Complex a = new Complex();
        a.real = 10;
        a.imag = 8;
        Complex b = new Complex();
        b.real = 10 ;
        b.imag = 9;
        Complex c = a.add(b);
        System.out.println("real = "+c.real+" imaginary = "+c.imag);
    }
}
