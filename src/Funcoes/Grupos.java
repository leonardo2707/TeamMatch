/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcoes;

/**
 *
 * @author emerson
 */
public class Grupos {
    private NoPessoas lista_Pessoas;
    private NoPessoas grupoAlfa;
    private NoPessoas grupoDelta;
    private Pessoa pessoa;
    private int cod;

    public NoPessoas getGrupoAlfa() {
        return grupoAlfa;
    }

    public NoPessoas getGrupoDelta() {
        return grupoDelta;
    }


    public NoPessoas getLista_Pessoas() {
        return lista_Pessoas;
    }

    public void inserirPessoaNaLista(NoPessoas noPessoa) {
        insereNoPessoas(lista_Pessoas, noPessoa);
    }
    
        public NoPessoas insereNoPessoas(NoPessoas lista, NoPessoas novo)
    {   novo.Cria_NoPessoas(pessoa);
    
        if(lista == null)
        {
            lista = novo;
        }else
        {
            NoPessoas ultimo = lista.buscaUltimo(lista);
            novo.setNoAntPessoa(ultimo);
            ultimo.setNoProxPessoa(novo);
        }
        return lista;
    }
    
    
}
