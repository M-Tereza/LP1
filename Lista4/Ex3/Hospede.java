package lista4_ex3;

import java.util.ArrayList;

public class Hospede {

    private String nome;
    private int codigo;
    private ArrayList<Reserva> reservas;

    public Hospede() {
        this.reservas = new ArrayList<Reserva>();
    }

    public String getNome() {
        if(this.nome == null){
            throw new IllegalArgumentException("Nome vazio");
        }
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo < 0){
            throw new IllegalArgumentException("Código inválido");
        }
        this.codigo = codigo;
    }

    public ArrayList<Reserva> getReservas() {
        return this.reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void alocarReserva(Reserva reserva){
        reserva.setHospede(this);
        this.reservas.add(reserva);
    }

    public void alocarUnicoReserva(Reserva reserva){
        if(!this.reservas.contains((reserva))) {
            reserva.setHospede(this);
            this.reservas.add(reserva);
        }
    }

    public void desalocarReserva(Reserva reserva){
        reserva.setHospede(null);
        this.reservas.remove(reserva);
    }

    public int obterQuantidadeReservas(){
        return this.reservas.size();
    }

    public boolean verificarReserva(Reserva reserva){
        return this.reservas.contains(reserva);
    }
}
