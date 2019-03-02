package tn.esprit.conge;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("solde")
public class CP {
	static List<Salarie> salaries=new ArrayList<Salarie>();
	public CP() {
		Salarie s=new Salarie("480","ahmed","salah",15);
		Salarie s1=new Salarie("300","fatma","mrad",0);
		Salarie s2=new Salarie("125","omar","saka",3);
		salaries.add(s);
		salaries.add(s1);
		salaries.add(s2);
	}
	
	/*@Path("{immatricule}")
	@GET
	public long getSolde(@PathParam(value="immatricule")String imma) {
		long sol=0;
		for (Salarie sa : salaries) 
		{
			if (sa.getImmatricule().equals(imma))
			{
				sol=sa.getSoldeCP();
			}
		}
		return sol;
	}
	*/
	@GET
	@Path("{immatricule}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Salarie getSalarieByImm(@PathParam(value="immatricule")String imm){
		Salarie s=null;
		for(Salarie sa:salaries){
			if(sa.getImmatricule().equals(imm))
				s=sa;
		}
		return s;
	}
	/*
	@PUT
	@Path("{immatricule}/{solde}")
	public long updatesolde(@PathParam(value="immatricule")String imm,@PathParam(value="solde")long solde){
		long so=0;
		Salarie s=null;
		for(Salarie sa:salaries){
			if(sa.getImmatricule().equals(imm))
				s=sa;
			    s.setSoldeCP(solde);
			    so=s.getSoldeCP();
			    so=so-solde;
		}
		return so;
	}*/
}
