abstract class Operacion {

  protected double numeroA = 0.0;
  protected double numeroB = 0.0;
  
  public double sumar (){
    return 0.0;
  }
  public double multiplicar (){
    return 0.0;
  }
  public double dividir (){
    return 0.0;
  }
  public double exponenciar (){
    return 0.0;
  }
  protected void setNumeroA (double numeroA){

    this.numeroA = numeroA;

  }
  protected double getNumeroA () {

    return numeroA;

  }

  protected void setNumeroB (double numeroB){

    this.numeroB = numeroB;

  }
  
  protected double getNumeroB () {

    return numeroB;

  }
}