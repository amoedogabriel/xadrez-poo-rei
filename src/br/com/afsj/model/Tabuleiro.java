package br.com.afsj.model;

import br.com.afsj.control.Xadrez;
import br.com.afsj.view.*;

import javax.swing.*;

public class Tabuleiro {

    protected static JFrame TELA;

    public static ArrayPecas listaBrancas = new ArrayPecas();
    public static ArrayPecas listaPretas = new ArrayPecas();

    protected static int corJogadorAtual = Xadrez.corBRANCA;
    protected static Peca pecaMarcada = null;
    protected static IPeca iPecaMarcada = null;

    protected static ITabuleiro iTabuleiro = new ITabuleiro();

    //protected static Peao peaoBranco1 = new Peao();
    //protected static IPeao iPeaoBranco1 = new IPeao(peaoBranco1);
    //protected static Peao peaoBranco2 = new Peao();
    //protected static IPeao iPeaoBranco2 = new IPeao(peaoBranco2);

    protected static Peao[] peoesBrancos = new Peao[8];
    protected static IPeao[] iPeoesBrancos = new IPeao[8];

    protected static Peao[] peoesPretos = new Peao[8];
    protected static IPeao[] iPeoesPretos = new IPeao[8];

    protected static Cavalo cavaloPreto1 = new Cavalo();
    protected static ICavalo iCavaloPreto1 = new ICavalo(cavaloPreto1);
    protected static Cavalo cavaloPreto2 = new Cavalo();
    protected static ICavalo iCavaloPreto2 = new ICavalo(cavaloPreto2);
    protected static Cavalo cavaloBranco1 = new Cavalo();
    protected static ICavalo iCavaloBranco1 = new ICavalo(cavaloBranco1);
    protected static Cavalo cavaloBranco2 = new Cavalo();
    protected static ICavalo iCavaloBranco2 = new ICavalo(cavaloBranco2);
    protected static Torre torreBranca1 = new Torre();
    protected static ITorre iTorreBranca1 = new ITorre(torreBranca1);
    protected static Torre torreBranca2 = new Torre();
    protected static ITorre iTorreBranca2 = new ITorre(torreBranca2);
    protected static Torre torrePreta1 = new Torre();
    protected static ITorre iTorrePreta1 = new ITorre(torrePreta1);
    protected static Torre torrePreta2 = new Torre();
    protected static ITorre iTorrePreta2 = new ITorre(torrePreta2);
    protected static Bispo bispoBranco1 = new Bispo();
    protected static IBispo iBispoBranco1 = new IBispo(bispoBranco1);
    protected static Bispo bispoBranco2 = new Bispo();
    protected static IBispo iBispoBranco2 = new IBispo(bispoBranco2);
    protected static Bispo bispoPreto1 = new Bispo();
    protected static IBispo iBispoPreto1 = new IBispo(bispoPreto1);
    protected static Bispo bispoPreto2 = new Bispo();
    protected static IBispo iBispoPreto2 = new IBispo(bispoPreto2);
    protected static Rei reiBranco = new Rei();
    protected static IRei iReiBranco = new IRei(reiBranco);
    protected static Rei reiPreto = new Rei();
    protected static IRei iReiPreto = new IRei(reiPreto);
    protected static Rainha rainhaBranca = new Rainha();
    protected static IRainha iRainhaBranca = new IRainha(rainhaBranca);
    protected static Rainha rainhaPreta = new Rainha();
    protected static IRainha iRainhaPreta = new IRainha(rainhaPreta);

    //protected static Peca peca = new Peca();

    public void iniciar(Tradutor t) {

        TELA = new JFrame(t.traduzir("Xadrez"));


        for (int i = 0; i < 8; i++) {
            peoesBrancos[i] = new Peao();
            peoesBrancos[i].setCor(Xadrez.corBRANCA);
            peoesBrancos[i].mover(i, 6);

            iPeoesBrancos[i] = new IPeao(peoesBrancos[i]);
            iPeoesBrancos[i].setIconeBranco(new ImageIcon("imagens/Peao-Brancas-Branco.png"));
            iPeoesBrancos[i].setIconeMarrom(new ImageIcon("imagens/Peao-Brancas-Marrom.png"));
            iPeoesBrancos[i].mover(i, 6);

            TELA.getContentPane().add(iPeoesBrancos[i].getImagem());
            listaBrancas.add(peoesBrancos[i]);
        }

        torreBranca1.setCor(Xadrez.corBRANCA);
        torreBranca1.mover(0, 7);
        iTorreBranca1.setIconeBranco(new ImageIcon("imagens/Torre-Brancas-Branco.png"));
        iTorreBranca1.setIconeMarrom(new ImageIcon("imagens/Torre-Brancas-Marrom.png"));
        iTorreBranca1.mover(0, 7);
        TELA.getContentPane().add(iTorreBranca1.getImagem());
        listaBrancas.add(torreBranca1);

        torreBranca2.setCor(Xadrez.corBRANCA);
        torreBranca2.mover(7, 7);
        iTorreBranca2.setIconeBranco(new ImageIcon("imagens/Torre-Brancas-Branco.png"));
        iTorreBranca2.setIconeMarrom(new ImageIcon("imagens/Torre-Brancas-Marrom.png"));
        iTorreBranca2.mover(7, 7);
        TELA.getContentPane().add(iTorreBranca2.getImagem());
        listaBrancas.add(torreBranca2);

        cavaloBranco1.setCor(Xadrez.corBRANCA);
        cavaloBranco1.mover(1, 7);
        iCavaloBranco1.setIconeBranco(new ImageIcon("imagens/Cavalo-Brancas-Branco.png"));
        iCavaloBranco1.setIconeMarrom(new ImageIcon("imagens/Cavalo-Brancas-Marrom.png"));
        iCavaloBranco1.mover(1, 7);
        TELA.getContentPane().add(iCavaloBranco1.getImagem());
        listaBrancas.add(cavaloBranco1);

        cavaloBranco2.setCor(Xadrez.corBRANCA);
        cavaloBranco2.mover(6, 7);
        iCavaloBranco2.setIconeBranco(new ImageIcon("imagens/Cavalo-Brancas-Branco.png"));
        iCavaloBranco2.setIconeMarrom(new ImageIcon("imagens/Cavalo-Brancas-Marrom.png"));
        iCavaloBranco2.mover(6, 7);
        TELA.getContentPane().add(iCavaloBranco2.getImagem());
        listaBrancas.add(cavaloBranco2);

        bispoBranco1.setCor(Xadrez.corBRANCA);
        bispoBranco1.mover(2, 7);
        iBispoBranco1.setIconeBranco(new ImageIcon("imagens/Bispo-Brancas-Branco.png"));
        iBispoBranco1.setIconeMarrom(new ImageIcon("imagens/Bispo-Brancas-Marrom.png"));
        iBispoBranco1.mover(2, 7);
        TELA.getContentPane().add(iBispoBranco1.getImagem());
        listaBrancas.add(bispoBranco1);

        bispoBranco2.setCor(Xadrez.corBRANCA);
        bispoBranco2.mover(5, 7);
        iBispoBranco2.setIconeBranco(new ImageIcon("imagens/Bispo-Brancas-Branco.png"));
        iBispoBranco2.setIconeMarrom(new ImageIcon("imagens/Bispo-Brancas-Marrom.png"));
        iBispoBranco2.mover(5, 7);
        TELA.getContentPane().add(iBispoBranco2.getImagem());
        listaBrancas.add(bispoBranco2);

        reiBranco.setCor(Xadrez.corBRANCA);
        reiBranco.mover(4, 7);
        iReiBranco.setIconeBranco(new ImageIcon("imagens/Rei-Brancas-Branco.png"));
        iReiBranco.setIconeMarrom(new ImageIcon("imagens/Rei-Brancas-Marrom.png"));
        iReiBranco.mover(4, 7);
        TELA.getContentPane().add(iReiBranco.getImagem());
        listaBrancas.add(reiBranco);

        rainhaBranca.setCor(Xadrez.corBRANCA);
		rainhaBranca.mover(3, 7);
		iRainhaBranca.setIconeBranco(new ImageIcon("imagens/Rainha-Brancas-Branco.png"));
		iRainhaBranca.setIconeMarrom(new ImageIcon("imagens/Rainha-Brancas-Marrom.png"));
		iRainhaBranca.mover(3, 7);
		TELA.getContentPane().add(iRainhaBranca.getImagem());
		listaBrancas.add(rainhaBranca);

        // Pretas

        for (int i = 0; i < 8; i++) {
            peoesPretos[i] = new Peao();
            peoesPretos[i].setCor(Xadrez.corPRETA);
            peoesPretos[i].mover(i, 1);

            iPeoesPretos[i] = new IPeao(peoesPretos[i]);
            iPeoesPretos[i].setIconeBranco(new ImageIcon("imagens/Peao-Pretas-Branco.png"));
            iPeoesPretos[i].setIconeMarrom(new ImageIcon("imagens/Peao-Pretas-Marrom.png"));
            iPeoesPretos[i].mover(i, 1);

            TELA.getContentPane().add(iPeoesPretos[i].getImagem());
            listaBrancas.add(peoesPretos[i]);
        }
        

        torrePreta1.setCor(Xadrez.corPRETA);
        torrePreta1.mover(0, 0);
        iTorrePreta1.setIconeBranco(new ImageIcon("imagens/Torre-Pretas-Branco.png"));
        iTorrePreta1.setIconeMarrom(new ImageIcon("imagens/Torre-Pretas-Marrom.png"));
        iTorrePreta1.mover(0, 0);
        TELA.getContentPane().add(iTorrePreta1.getImagem());
        listaBrancas.add(torrePreta1);

        torrePreta2.setCor(Xadrez.corPRETA);
		torrePreta2.mover(7, 0);
		iTorrePreta2.setIconeBranco(new ImageIcon("imagens/Torre-Pretas-Branco.png"));
		iTorrePreta2.setIconeMarrom(new ImageIcon("imagens/Torre-Pretas-Marrom.png"));
		iTorrePreta2.mover(7, 0);
		TELA.getContentPane().add(iTorrePreta2.getImagem());
		listaBrancas.add(torrePreta2);


        cavaloPreto1.setCor(Xadrez.corPRETA);
        cavaloPreto1.mover(1, 0);
        iCavaloPreto1.setIconeBranco(new ImageIcon("imagens/Cavalo-Pretas-Branco.png"));
        iCavaloPreto1.setIconeMarrom(new ImageIcon("imagens/Cavalo-Pretas-Marrom.png"));
        iCavaloPreto1.mover(1, 0);
        TELA.getContentPane().add(iCavaloPreto1.getImagem());
        listaPretas.add(cavaloPreto1);

        cavaloPreto2.setCor(Xadrez.corPRETA);
        cavaloPreto2.mover(6, 0);
        iCavaloPreto2.setIconeBranco(new ImageIcon("imagens/Cavalo-Pretas-Branco.png"));
        iCavaloPreto2.setIconeMarrom(new ImageIcon("imagens/Cavalo-Pretas-Marrom.png"));
        iCavaloPreto2.mover(6, 0);
        TELA.getContentPane().add(iCavaloPreto2.getImagem());
        listaPretas.add(cavaloPreto2);

        bispoPreto1.setCor(Xadrez.corPRETA);
        bispoPreto1.mover(2, 0);
        iBispoPreto1.setIconeBranco(new ImageIcon("imagens/Bispo-Pretas-Branco.png"));
        iBispoPreto1.setIconeMarrom(new ImageIcon("imagens/Bispo-Pretas-Marrom.png"));
        iBispoPreto1.mover(2, 0);
        TELA.getContentPane().add(iBispoPreto1.getImagem());
        listaBrancas.add(bispoPreto1);

        bispoPreto2.setCor(Xadrez.corPRETA);
		bispoPreto2.mover(5, 0);
		iBispoPreto2.setIconeBranco(new ImageIcon("imagens/Bispo-Pretas-Branco.png"));
		iBispoPreto2.setIconeMarrom(new ImageIcon("imagens/Bispo-Pretas-Marrom.png"));
		iBispoPreto2.mover(5, 0);
		TELA.getContentPane().add(iBispoPreto2.getImagem());
		listaBrancas.add(bispoPreto2);


        reiPreto.setCor(Xadrez.corPRETA);
        reiPreto.mover(4, 0);
        iReiPreto.setIconeBranco(new ImageIcon("imagens/Rei-Pretas-Branco.png"));
        iReiPreto.setIconeMarrom(new ImageIcon("imagens/Rei-Pretas-Marrom.png"));
        iReiPreto.mover(4, 0);
        TELA.getContentPane().add(iReiPreto.getImagem());
        listaBrancas.add(reiPreto);

        rainhaPreta.setCor(Xadrez.corBRANCA);//branco = 1 preto = 0
        rainhaPreta.mover(3, 0);
        iRainhaPreta.setIconeBranco(new ImageIcon("imagens/Rainha-Pretas-Branco.png"));
        iRainhaPreta.setIconeMarrom(new ImageIcon("imagens/Rainha-Pretas-Marrom.png"));
        iRainhaPreta.mover(3, 0);
        TELA.getContentPane().add(iRainhaPreta.getImagem());
        listaBrancas.add(rainhaPreta);

        TELA.getContentPane().add(iTabuleiro.getImagem());
        TELA.setSize(400, 400);
        TELA.setVisible(true);
        TELA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void avaliarEventoPeca(Peca p, IPeca ip) {
        if (p.getCor() == corJogadorAtual)
            marcarPeca(p, ip);
        else if (pecaMarcada != null)
            capturarPeca(p, ip);
    }

    public static void avaliarEventoTabuleiro(int x, int y) {
        moverPecaMarcada(x, y);
    }

    public static void marcarPeca(Peca p, IPeca ip) {
        if (iPecaMarcada != null)
            iPecaMarcada.desmarcar();
        pecaMarcada = p;
        iPecaMarcada = ip;
        iPecaMarcada.marcar();

    }

    public static void capturarPeca(Peca p, IPeca ip) {
        if (pecaMarcada.capturar(p.getPosX(), p.getPosY())) {
            ip.remover();
            TELA.getContentPane().remove(ip.getImagem());
            iPecaMarcada.desmarcar();
            iPecaMarcada.mover(p.getPosX(), p.getPosY());
            p.remover();
            pecaMarcada = null;
            iPecaMarcada = null;
            if (corJogadorAtual == Xadrez.corBRANCA)
                corJogadorAtual = Xadrez.corPRETA;
            else
                corJogadorAtual = Xadrez.corBRANCA;
        }
    }

    public static void moverPecaMarcada(int x, int y) {
        if (pecaMarcada == null) {
            if (corJogadorAtual == 0) {
                System.out.println("Jogador peças pretas faça sua jogada.");
            } else System.out.println("Jogador peças brancas faça sua jogada.");
        } else {
            if (pecaMarcada.getPosX() == 4 && pecaMarcada.getPosY() == 7 && pecaMarcada.getMoveCont() == 0) {
                if (x == 6 && y == 7) {
                    if ((bispoBranco2.getPosX() == 5 && bispoBranco2.getPosY() == 7)) {
                        System.out.println("Movimento não permitido pois tem peças no caminho.");
                    } else {
                        System.out.println("Roque Pequeno");
                        pecaMarcada.mover(6, 7);
                        iPecaMarcada.desmarcar();
                        iPecaMarcada.mover(6, 7);
                        pecaMarcada = null;
                        iPecaMarcada = null;

                        marcarPeca(torreBranca2, iTorreBranca2);
                        pecaMarcada.mover(5, 7);
                        iPecaMarcada.desmarcar();
                        iPecaMarcada.mover(5, 7);
                        pecaMarcada = null;
                        iPecaMarcada = null;
                    }
                } else if (x == 1 && y == 7) {
                    if ((bispoBranco1.getPosX() == 2 && bispoBranco1.getPosY() == 7)) {
                        System.out.println("Movimento não permitido pois tem peças no caminho.");
                    } else {
                        if ((rainhaBranca.getPosX() == 3 && rainhaBranca.getPosY() == 7)) {
                            System.out.println("Movimento não permitido pois tem peças no caminho.");
                        } else {
                            System.out.println("Roque Grande");
                            pecaMarcada.mover(1, 7);
                            iPecaMarcada.desmarcar();
                            iPecaMarcada.mover(1, 7);
                            pecaMarcada = null;
                            iPecaMarcada = null;

                            marcarPeca(torreBranca1, iTorreBranca1);
                            pecaMarcada.mover(2, 7);
                            iPecaMarcada.desmarcar();
                            iPecaMarcada.mover(2, 7);
                            pecaMarcada = null;
                            iPecaMarcada = null;
                        }
                    }
                } else {
                    pecaMarcada.mover(x, y);
                    iPecaMarcada.desmarcar();
                    iPecaMarcada.mover(x, y);
                    pecaMarcada = null;
                    iPecaMarcada = null;
                    if (corJogadorAtual == Xadrez.corBRANCA)
                        corJogadorAtual = Xadrez.corPRETA;
                    else
                        corJogadorAtual = Xadrez.corBRANCA;
                }
            } else {
                if (pecaMarcada.mover(x, y)) {
                    iPecaMarcada.desmarcar();
                    iPecaMarcada.mover(x, y);
                    pecaMarcada = null;
                    iPecaMarcada = null;
                    if (corJogadorAtual == Xadrez.corBRANCA)
                        corJogadorAtual = Xadrez.corPRETA;
                    else
                        corJogadorAtual = Xadrez.corBRANCA;
                }
            }
        }

    }

}