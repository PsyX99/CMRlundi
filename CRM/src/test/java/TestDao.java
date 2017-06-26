import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;











import antlr.collections.List;
import fr.inti.model.Client;
import fr.inti.model.Commande;
import fr.inti.model.Commercial;
import fr.inti.model.Contact;
import fr.inti.model.Equipe_campagne;
import fr.inti.model.Equipe_com;
import fr.inti.model.Facture;
import fr.inti.model.Fiche_client;
import fr.inti.model.Histo_tarification;
import fr.inti.model.Produit;
import fr.inti.model.Proposition_commerciale;
import fr.inti.model.Resp_commercial;

/**
 * @author YoannScrum
 */

public class TestDao {
	public static void main(String[] args) throws ParseException {
		
		/*
		 * Méthode pour renseigner une date :)
		 */
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date d = sdf.parse("2017/05/12");
		
		
		
		
		/*
		 * 
		 * Zone "vert" commercial
		 * 
		 */
		
		/*
		 * Proposition Commercial
		 */

		
		Proposition_commerciale propocomm1 = new Proposition_commerciale(d, d,
				"Bonne", "CB", 10, "En cours");
		Proposition_commerciale propocomm2 = new Proposition_commerciale(
				d, d, "Parfaite", "Liquide", 100,
				"En cours");
		Proposition_commerciale propocomm3 = new Proposition_commerciale(
				d, d, "Détruit", "Chèque", 1000,
				"En cours");

		/*
		 * /* Equipe commercial
		 */

		Equipe_com eqcom1 = new Equipe_com();
		Equipe_com eqcom2 = new Equipe_com();
		Equipe_com eqcom3 = new Equipe_com();


		/*
		 * Commercial
		 */

		Commercial com1 = new Commercial("Douet", "Maxilien",
				"Chef de projet commerce", d, 500, 0);
		Commercial com2 = new Commercial("Franckyky", "Franck",
				"Intégrateur de commerce", d, 999, 5);
		Commercial com3 = new Commercial("Kerbrat", "Yoann", "Scrummercial",
				d, 9999, 50);

		/*
		 * Equipe compagne
		 */

		Equipe_campagne eqcamp1 = new Equipe_campagne();
		Equipe_campagne eqcamp2 = new Equipe_campagne();

		/*
		 * Resp Commercial
		 */

		Resp_commercial rescom1 = new Resp_commercial();
		Resp_commercial rescom2 = new Resp_commercial();
		Resp_commercial rescom3 = new Resp_commercial();

		/*
		 * Fiche client
		 */

		Fiche_client fc1 = new Fiche_client("Reçu fiche client1", d, 4, 4.0, d, d);
		Fiche_client fc2 = new Fiche_client("Reçu fiche client2", d, 4, 4.0, d, d);

		
		/*
		 * Contact
		 */
		
		Contact contact1 = new Contact("Den", "Wej", "Je suis un contact");
		Contact contact2 = new Contact("Den2", "Wej2", "Je suis un contact2");
		Contact contact3 = new Contact("Den3", "Wej3", "Je suis un contact3");
		
		/*
		 * proposition commerciale (MANY) to Equipe commercial (ONE) 
		 */

		propocomm1.setEquipe_com(eqcom1);
		propocomm2.setEquipe_com(eqcom2);
		propocomm3.setEquipe_com(eqcom3);
		
		/*
		 * Equipe_comm (ONE) to Resp_commercial (ONE)
		 */
		
		eqcom1.setResp_commercial(rescom1);
		eqcom2.setResp_commercial(rescom2);
		eqcom3.setResp_commercial(rescom3);
		
		/*
		 * Equipe de campagne (ONE) to Commercial (MANY)
		 */
		
		
		com1.setEquipe_campagne(eqcamp1);
		com2.setEquipe_campagne(eqcamp2);
		com3.setEquipe_campagne(eqcamp2);
		
		
		/*
		 * Fiche client (MANY) to equipe_com (ONE)
		 */
		
		fc1.setEquipe_com(eqcom1);
		fc1.setEquipe_com(eqcom2);
		fc1.setEquipe_com(eqcom3);
		
		
		/*
		 * Contact (ONE) to Commercial (ONE)
		 */
		
		com1.setContact(contact1);
		com2.setContact(contact2);
		com3.setContact(contact3);
		
		
		
		
		/*
		 * Commit :)
		 */
		
		/*
		 * 
		 * Zone "bleu" produit commande
		 * 
		 */
		
		/*
		 * Produit
		 */
		
		Produit p1 = new Produit("Café", "Kawa", "caféine", 5.5, "Caf-ard", "K-fart", "Commerce équitable", 12000000);
		Produit p2 = new Produit("SuperCafé", "SuperKawa", "Supercaféine", 59.99, "Super-Caf-ard", "Super-K-fart", "Super-commerce équitable", 12);
		
		/*
		 * Histo_tarification
		 */
		
		Histo_tarification ht1 = new Histo_tarification(d, d);
		Histo_tarification ht2 = new Histo_tarification(d, d);
		
		
		/*
		*histo_tarification (MANY) to produit (ONE)
		*/
		
		ht1.setProduit(p1);
		ht2.setProduit(p1);
		
	
		
		/*
		* commande
		*/
		
		Commande cmd1 = new Commande(d, d, "ConditionA", "CB", 2, "en cours préparation", d);
		Commande cmd2 = new Commande(d, d, "ConditionB", "Cheque", 4, "reçu", d);


		/*
		 * facture
		 */
		Facture fact1 = new Facture(d, 4, d, 5.5, 1);
		Facture fact2 = new Facture(d, 0, d, 4.4, 0);
		Facture fact3 = new Facture(d, 4, d, 10.5, 1);
		Facture fact4= new Facture(d, 0, d, 410.4, 1);
		
		/*
		 * On doit persister la classe slave (ou il y a mappedby) avant.
		 */
		
		/*
		 * Facture (MANY-slave) to Commande (MANY)
		 */
		
		// To-do persist fact1 / fact2
		//em.save(fact1):
		//em.save(fact2);
		List<Facture> listFact1 = new ArrayList<Facture>();
		listFact1.add(fact1);
		listFact1.add(fact2);
		
		List<Facture> listFact2 = new ArrayList<Facture>();
		listFact1.add(fact3);
		listFact1.add(fact4);
		
		cmd1.setListe_facture(listFact1);
		cmd2.setListe_facture(listFact2);
		
		
		/*
		 * Fiche Client (MANY) to Produit (MANY-slave)
		 */
		List<Produit> listFProd1 = new ArrayList<Produit>();
		listFProd1.add(p1);
		listFProd1.add(p2);
		
		List<Facture> listProd2 = new ArrayList<Produit>();
		listProd2.add(p1);
		listProd2.add(p2);

	
		fc1.setListe_facture(listFProd1);
		fc2.setListe_facture(listProd2);
		

		
		/*
		* proposition  commercial (MANY) to Produit (MANY-slave)
		* 
		* 
		*/
		
		propocomm1.setListe_produit(listFProd1);
		propocomm2.setListe_produit(listFProd2);
		
		
		
		
		
		
	}
}
