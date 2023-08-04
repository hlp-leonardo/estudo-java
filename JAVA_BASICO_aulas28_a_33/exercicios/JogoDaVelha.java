package com.loiane.cursojava.aula33.exerciciosAula28_33;

public class JogoDaVelha {

    private char[][] jogoVelha;
    private int jogada;

    public JogoDaVelha() {
        setJogoVelha(new char[3][3]);
        setJogada(1);
    }

    public boolean validarJogada(int linha, int coluna, char sinal) {

        if (getJogoVelha()[linha][coluna] == 'X' || getJogoVelha()[linha][coluna] == 'O') {
            return false;

        } else { //jogada válida
            getJogoVelha()[linha][coluna] = sinal;
            setJogada(getJogada() + 1);
            return true;
        }
    }

    public void imprimirTabuleiro() {
        for (int i = 0; i < getJogoVelha().length; i++) {
            for (int j = 0; j < getJogoVelha()[i].length; j++) {
                System.out.print(getJogoVelha()[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public boolean verificarGanhador(char sinal) {
        if ((getJogoVelha()[0][0] == sinal && getJogoVelha()[0][1] == sinal && getJogoVelha()[0][2] == sinal) || //linha 1
                (getJogoVelha()[1][0] == sinal && getJogoVelha()[1][1] == sinal && getJogoVelha()[1][2] == sinal) || //linha 2
                (getJogoVelha()[2][0] == sinal && getJogoVelha()[2][1] == sinal && getJogoVelha()[2][2] == sinal) || //linha 3
                (getJogoVelha()[0][0] == sinal && getJogoVelha()[1][0] == sinal && getJogoVelha()[2][0] == sinal) || //coluna 1
                (getJogoVelha()[0][1] == sinal && getJogoVelha()[1][1] == sinal && getJogoVelha()[2][1] == sinal) || //coluna 2
                (getJogoVelha()[0][2] == sinal && getJogoVelha()[1][2] == sinal && getJogoVelha()[2][2] == sinal) || //coluna 3
                (getJogoVelha()[0][0] == sinal && getJogoVelha()[1][1] == sinal && getJogoVelha()[2][2] == sinal) || //diagonal
                (getJogoVelha()[0][2] == sinal && getJogoVelha()[1][1] == sinal && getJogoVelha()[2][0] == sinal)) {  //diagonal inversa
            return true;
        }
        return false;
    }

    public boolean vezJogador1(){
        if (getJogada() % 2 == 1){
            return true;
        }
        return false;
    }


    public char[][] getJogoVelha() {
        return jogoVelha;
    }

    public void setJogoVelha(char[][] jogoVelha) {
        this.jogoVelha = jogoVelha;
    }

    public int getJogada() {
        return jogada;
    }

    public void setJogada(int jogada) {
        this.jogada = jogada;
    }
}