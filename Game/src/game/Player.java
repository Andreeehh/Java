/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author andre
 */
class Player {
    private String nick;
    private String tipoGame;
    public Player(String nick, String tipoGame){
        this.nick = nick;
        this.tipoGame = tipoGame;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getTipoGame() {
        return tipoGame;
    }

    public void setTipoGame(String tipoGame) {
        this.tipoGame = tipoGame;
    }
    
    public String relatorioPlayer(){
        return "usuario " + nick + " jogo " + tipoGame + "\n" ;
}
}