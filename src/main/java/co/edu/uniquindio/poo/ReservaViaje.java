package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class ReservaViaje {

    private LocalDate fechaSalida;
    private LocalDate duracionViaje;
    private TipoAlojamiento tipoAlojamiento;
    private String transporte;
    private String actividades; 
    private String dietaEspecial;
    private String destino;
    
    public ReservaViaje(LocalDate fechaSalida, LocalDate duracionViaje, String destino, TipoAlojamiento tipoAlojamiento,
    String transporte, String actividades, String dietaEspecial) {

        this.fechaSalida = fechaSalida;
        this.duracionViaje = duracionViaje;
        this.destino = destino;
        this.tipoAlojamiento = tipoAlojamiento;
        this.transporte = transporte;
        this.actividades = actividades;
        this.dietaEspecial = dietaEspecial;
    }

        // Métodos para acceder a los atributos de la reserva de viajes
        public LocalDate getFechaSalida() {
            return fechaSalida;
        }

        public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
        }
    
        public LocalDate getDuracionViaje() {
            return duracionViaje;
        }

        public void setduracionViaje(LocalDate duracionViaje){
            this.duracionViaje = duracionViaje;
        }
    
        public String getDestino() {
            return destino;
        }

        public void setDestino(String destino){
            this.destino = destino;
        }
    
        public TipoAlojamiento getTipoAlojamiento() {
            return tipoAlojamiento;
        }
    
        public void setTipoAlojamiento(TipoAlojamiento tipoAlojamiento){
            this.tipoAlojamiento = tipoAlojamiento;
            
        }
        public String getTransporte() {
            return transporte;
        }

        public void setTransporte(String transporte){
            this.transporte = transporte;
        }
    
        public String getActividades() {
            return actividades;
        }
    
        public void setActividaes(String actividades){
            this.actividades = actividades;
        }
        public String getDietaEspecial() {
            return dietaEspecial;
        }

        public void setDietaEspecial(String dietaEspecial){
            this.dietaEspecial = dietaEspecial;
        }

        public static ReservaViajeBuilder builder(){
            return new ReservaViajeBuilder();
        }

    public static class ReservaViajeBuilder{

        private LocalDate fechaSalida;
        private LocalDate duracionViaje;
        private TipoAlojamiento tipoAlojamiento;
        private String transporte;
        private String actividades; 
        private String dietaEspecial;
        private String destino;

        private ReservaViajeBuilder(){}
            
        public ReservaViajeBuilder fechaSalida(LocalDate fechaSalida) {
            this.fechaSalida = fechaSalida;
            return this;
        }

        public ReservaViajeBuilder duracionViaje(LocalDate duracionViaje){
            this.duracionViaje = duracionViaje; 
            return this;
            }
        
        public ReservaViajeBuilder tipoAlojamiento(TipoAlojamiento tipoAlojamiento){
            this.tipoAlojamiento = tipoAlojamiento;
            return this;
        }

        public ReservaViajeBuilder transporte(String transporte){
            this.transporte = transporte;
            return this;
        }

        public ReservaViajeBuilder actividades (String actividades){
            this.actividades = actividades;
            return this;
        }

        public ReservaViajeBuilder dietaEpecial(String dietaEspecial){
            this.dietaEspecial = dietaEspecial;
            return this;
        }
        
        public ReservaViajeBuilder destino(String destino){
            this.destino = destino;
            return this;
        }

        public ReservaViaje build(){
            return new ReservaViaje(fechaSalida, duracionViaje, destino, tipoAlojamiento, transporte, actividades, dietaEspecial);
        }
    }
}
    