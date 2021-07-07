public abstract class ModeloDbz {


    String fabricante;
    String modelo ;
    String categoria;
    String material;
    boolean tampada;

    void status(){
        System.out.println("Fabricante: "+this.fabricante);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Categoria: "+this.categoria);
        System.out.println("Material: "+this.material);
        System.out.println("Esta tampada ??? "+this.tampada);
    }



                 void beber(){

        if(this.tampada==false){
            System.out.println("Estou bebendo ");}

            else {
                System.out.println("Se esta tampada ,logo não consigo beber ");
            }


    }





                    void tampada() {

                        this.tampada = true;
                                           }

                          void destampada()
                          {
                              this.tampada=false;

                                             }




}
