public class ReproductorMusica {
    
    //ATRIBUTOS
    private String[] canciones;
    private int[] cancionesFavoritas;
    private boolean pausado;
    private int cancionReproduciendo;
    
    //MÉTODOS
    public ReproductorMusica(String[] canciones) {
        this.canciones = canciones;
        this.pausado = true;
        this.cancionReproduciendo = 0;
        this.cancionesFavoritas = new int[canciones.length];
        for (int i = 0; i < canciones.length; i++){
            this.cancionesFavoritas[i] = -1;
        }
        
    }
    
    public void proximaCancion(){
        //COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO
        if(this.cancionReproduciendo >= 0 && this.cancionReproduciendo < (this.canciones.length -1)){
            this.cancionReproduciendo = this.cancionReproduciendo + 1;
        }
        else if (this.cancionReproduciendo >= this.canciones.length - 1){
            this.cancionReproduciendo = (this.cancionReproduciendo + 1) % this.canciones.length;
        }
    }
    
    public void devolverCancion(){
        //COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO
        if (this.cancionReproduciendo == 0){
            this.cancionReproduciendo = (this.cancionReproduciendo + this.canciones.length -1) % this.canciones.length;
        } else{
            this.cancionReproduciendo = this.cancionReproduciendo -1;
        }
    }
    
    public void cambiarEstadoReproduccion(){
        //COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO
        this.pausado = !this.pausado;
       
    }
    
    //NO SE DEBE PREOCUPAR POR DESARROLLAR ESTE MÉTODO. ¡NO ELIMINARLO NI MODIFICARLO!
    public void agregarCancionesFavoritas(){
        for(int i = 0; i < cancionesFavoritas.length; i++)
            /*En caso de que encuentre que cancionReproduciendo está en el banco de cancionesFavoritas
            no seguimos buscando espacio libre para agregarla, y salimos del método*/
            if(cancionesFavoritas[i] == cancionReproduciendo)
                return;
            //Pero si no la encontró, y además encuentra un espacio donde añadirlo, lo hace
            else if(cancionesFavoritas[i] == -1){
                cancionesFavoritas[i] = cancionReproduciendo;
                return;
            }                
    }

    public String[] getCanciones() {
        //COMPLETE AQUÍ EL GETTER CORRESPONDIENTE
        return this.canciones;
    }

    public void setCanciones(String[] canciones) {
        //COMPLETE AQUÍ EL SETTER CORRESPONDIENTE
        this.canciones = canciones;
    }

    public void setCancionReproduciendo(int[] cancionReproduciendo) {
        this.cancionReproduciendo = this.cancionReproduciendo;
    }

    public int[] getCancionesFavoritas() {
        //COMPLETE AQUÍ EL GETTER CORRESPONDIENTE
        return this.cancionesFavoritas;
    }

    public void setCancionesFavoritas(int[] cancionesFavoritas) {
        //COMPLETE AQUÍ EL SETTER CORRESPONDIENTE
        this.cancionesFavoritas = this.cancionesFavoritas;
    }

    public boolean isPausado() {
        //COMPLETE AQUÍ EL GETTER CORRESPONDIENTE
        return this.pausado;
    }

    public void setPausado(boolean pausado) {
        //COMPLETE AQUÍ EL SETTER CORRESPONDIENTE
        this.pausado = this.pausado;
    }

    public int getCancionReproduciendo() {
        //COMPLETE AQUÍ EL GETTER CORRESPONDIENTE
        return this.cancionReproduciendo;
    }

    public void setCancionReproduciendo(int cancionReproduciendo) {
        //COMPLETE AQUÍ EL SETTER CORRESPONDIENTE
        this.cancionReproduciendo = this.cancionReproduciendo;
    }
    
}
