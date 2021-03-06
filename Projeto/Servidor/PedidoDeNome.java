/**
	A classe PedidoDeNome representa um pedido do nome de determinado Cliente,
	tendo como base uma String que respresenta o nome do mesmo, a ser mandado para o Servidor.
	Instancias desta classe permitem armazenar determinado nome de Cliente.
	@author Eduardo Migueis, Enzo Spinella, Gabriel Scalese e Nicolas Duarte.
	@since 2019.
*/
public class PedidoDeNome extends Comunicado
{
	private String nome;

	/**
		Constroi uma instancia da classe PedidoDeNome.
		@param nome determina o nome a ser armazenado na classe.
	*/
	public PedidoDeNome(String nome)
	{
		this.nome = nome;
	}

	/**
		Retorna o nome armazenado.
		@return retorna o nome relativo ao atributo desta classe.
	*/
	public String getNome()
	{
		return this.nome;
	}

	/**
		Constroi uma copia da instancia da classe PedidoDeNome dada.
		Para tanto, deve ser fornecida uma instancia da classe
		PedidoDeNome para ser utilizada como modelo para a
		construcao da nova instancia.
		@param ped a instancia da classe PedidoDeNome a ser usada
			como modelo.
		@throws Exception se o modelo for null.
	*/
	public PedidoDeNome(PedidoDeNome ped) throws Exception
	{
		if(ped == null)
			throw new Exception("O parametro era null");

		this.nome = ped.nome;
	}

	/**
	    Clona um PedidoDeNome.
	    Produz e resulta uma copia do PedidoDeNome representado pela instancia
	    a qual o metodo for aplicado.
	    @return a copia do PedidoDeNome representado pela instancia a qual
	    o metodo for aplicado.
	*/
	public Object clone()
	{
		PedidoDeNome ret = null;

		try
		{
			ret = new PedidoDeNome(this);
		}
		catch(Exception ex)
		{}

		return ret;
	}

	/**
	    Gera uma representacao textual de todo conteudo do nome.
	    Produz e resulta um String com o nome.
	    @return um String contendo o conteudo do nome.
	*/
	public String toString()
	{
		return "Nome: " + this.nome;
	}

	/**
	    Verifica a igualdade entre dois PedidosDeNome.
	    Verifica se o Object fornecido como parametro representa um
	    PedidoDeNome igual aquele representado pela instancia a qual este
	    metodo for aplicado, resultando true em caso afirmativo,
	    ou false, caso contrario.
	    @param  obj o objeto a ser comparado com a instancia a qual esse metodo
	            for aplicado.
	    @return true, caso o Object fornecido ao metodo e a instancia chamante do
	            metodo representarem PedidosDeNome iguais, ou false, caso contrario.
	*/
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;

		if(obj.getClass() != this.getClass())
			return false;

		if(this == obj)
			return true;

		PedidoDeNome ped = (PedidoDeNome) obj;
		if(ped.nome.equals(this.nome))
			return true;

		return false;
	}

	/**
		 Calcula o codigo de espalhamento (ou codigo de hash) de um PedidoDeNome.
		 Calcula e resulta o codigo de espalhamento (ou codigo de hash, ou ainda o
		 hashcode) do PedidoDeNome representada pela instancia a qual o metodo for aplicado.
		 @return o codigo de espalhamento do PedidoDeNome chamante do metodo.
	*/
	public int hashCode()
	{
		int ret = 17;

		ret = ret * 17 + this.nome.hashCode();

		if(ret < 0)
			ret = -ret;

		return ret;
	}
}
