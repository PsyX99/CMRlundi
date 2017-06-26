
 function validatIdGroupe(){
	 var fieldGroupe = document.getElementById("idGroupe");
	 var fieldError =document.getElementById("idGroupeError");
	  if(fieldGroupe.selectedIndex==0){
		  fieldError.innerHTML = "veuillez selectionner un groupe SVP";
		  return false;
	  }else{
		  fieldError.innerHTML = ""; 
	  }
	  return true;
	 
 }
 
 function validateEmpToGro(){
	 
	 var fieldGroupe          = document.getElementById("idGro");
	 var fielcodeEmploye      = document.getElementById("codeEmploye");
	 var fieldGroupeError     = document.getElementById("idGroupeErr");
	 var fielcodeEmployeError = document.getElementById("codeEmployeError");
	 
	if(fieldGroupe.selectedIndex == 0){
		fieldGroupeError.innerHTML="veuillez selectionner un groupe SVP";
		return false;
	}else{
		fieldGroupeError.innerHTML="";
	}
	if(fielcodeEmploye.selectedIndex == 0){
		fielcodeEmployeError.innerHTML="veuillez selectionner un employe SVP";
		return false;
	}else{
		fielcodeEmployeError.innerHTML="";
	}
	return true;
 }
 /**
  * validation 
  * page 
  * compte
  * 
  **/
 
 function addCompteCourant(){
	 var fieldsoldeCompte          = document.getElementById("soldeCompte").value;
	 var fieldsoldeCompteError     = document.getElementById("soldeCompteError");
	 
	 var fielddecouvert          = document.getElementById("decouvert").value;
	 var fielddecouvertError     = document.getElementById("decouvertError");
	 
	 var selectidClientCc             = document.getElementById("idClientCc");
	 var selectidClientErrorCc        = document.getElementById("idClientErrorCc");
	 
	 var selectideEmployeCc             = document.getElementById("ideEmployeCc");
	 var selectIdEmployeErrorCc        = document.getElementById("idEmployeErrorCc");
	 
	 
	 if(fieldsoldeCompte.length == 0){
		 fieldsoldeCompteError.innerHTML="veuillez renseigner le solde SVP";
		 return false;
	 }
	 else if(fieldsoldeCompte.length>0){
		 fieldsoldeCompteError.innerHTML="";
	 }
	 
	 if(fielddecouvert.length == 0){
		 fielddecouvertError.innerHTML="veuillez renseigner le decouvert SVP";
		 return false;
	 }
	 else if(fielddecouvert.length > 0){
		 fielddecouvertError.innerHTML="";
	 }
	 
	 if(selectidClientCc.selectedIndex == 0){
		 selectidClientErrorCc.innerHTML="veuillez selectionner un client SVP";
			return false;
	 }else {
		 selectidClientErrorCc.innerHTML="";
	 }
	 if(selectideEmployeCc.selectedIndex == 0){
		 selectIdEmployeErrorCc.innerHTML="veuillez selectionner un employe SVP";
			return false;
	 }else {
		 selectIdEmployeErrorCc.innerHTML="";
	 }
	 
	 return true; 
	 
 }
 
 function addCompteEparge(){
	 var fieldsoldeCompteEp         = document.getElementById("soldeCompteEp").value;
	 var fieldsoldeCompteEpError     = document.getElementById("soldeCompteEpError");
	 
	 var fieldtauxInteret          = document.getElementById("tauxInteret").value;
	 var fieldtauxInteretError    = document.getElementById("tauxInteretError");
	 
	 var selectidClientCe             = document.getElementById("idClientCe");
	 var selectidClientErrorCe        = document.getElementById("idClientErrorCe");
	 
	 var selectideEmployeCe             = document.getElementById("codeEmployeCe");
	 var selectIdEmployeErrorCe        = document.getElementById("codeEmployeErrorCe");
	 
	 
	 if(fieldsoldeCompteEp.length == 0){
		 fieldsoldeCompteEpError.innerHTML="veuillez renseigner le solde SVP";
		 return false;
	 }
	 else if(fieldsoldeCompteEp.length>0){
		 fieldsoldeCompteEpError.innerHTML="";
	 }
	 
	 if(fieldtauxInteret.length == 0){
		 fieldtauxInteretError.innerHTML="veuillez renseigner le taux d'interet SVP";
		 return false;
	 }
	 else if(fieldtauxInteret.length > 0){
		 fieldtauxInteretError.innerHTML="";
	 }
	 
	 if(selectidClientCe.selectedIndex == 0){
		 selectidClientErrorCe.innerHTML="veuillez selectionner un client SVP";
			return false;
	 }else {
		 selectidClientErrorCe.innerHTML="";
	 }
	 if(selectideEmployeCe.selectedIndex == 0){
		 selectIdEmployeErrorCe.innerHTML="veuillez selectionner un employe SVP";
			return false;
	 }else {
		 selectIdEmployeErrorCe.innerHTML="";
	 }
	 
	 return true; 
	 
 }
/**
 * validation
 * page 
 * banque
 **/
 
 function affecterCompteToBanque(){
	 var selectidBanque             = document.getElementById("idBanque");
	 var selectidBanqueError        = document.getElementById("idBanqueError");
	 
	 var selectidCompteB             = document.getElementById("idCompteB");
	 var selectidCompteBerror       = document.getElementById("idCompteBerror");
	 
	 if(selectidBanque.selectedIndex == 0){
		 selectidBanqueError.innerHTML="veuillez selectionner une banque SVP";
			return false;
	 }else {
		 selectidBanqueError.innerHTML="";
	 }
	 if(selectidCompteB.selectedIndex == 0){
		 selectidCompteBerror.innerHTML="veuillez selectionner un compte SVP";
			return false;
	 }else {
		 selectidCompteBerror.innerHTML="";
	 }
	 
	 return true; 

	 
 }
