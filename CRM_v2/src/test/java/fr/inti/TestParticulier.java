package fr.inti;

import static org.junit.Assert.assertNotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.inti.config.JPAConfig;
import fr.inti.dao.IParticulierDAO;
import fr.inti.model.Particulier;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { JPAConfig.class })
public class TestParticulier {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		@Autowired
		@Qualifier(value = "particulierDao")
		private IParticulierDAO pDao;
		
		@Test
		public void testAddParticulier() {
			try{
		Particulier p1= new Particulier("tel", 3, 2, 1547854785, "OUI", "OUI", simpleDateFormat.parse("03/02/2001"), 2, "mari�", "entrepreneur", 32);
		Particulier p2= new Particulier("mail", 4, 2, 123456, "NON", "NON", simpleDateFormat.parse("06/05/2004"), 2, "mari�", "au_foyer", 30);
		Particulier p3= new Particulier("direct", 1, 1, 654321, "OUI", "NON", simpleDateFormat.parse("09/08/2007"), 2, "c�libataire", "chomeur", 28);
		
		pDao.save(p1);
		pDao.save(p2);
		pDao.save(p3);
		
		assertNotNull(p1);
		assertNotNull(p2);
		assertNotNull(p3);
		
			}
			catch (ParseException e) {
				e.printStackTrace();
			}
		}
		
	}


