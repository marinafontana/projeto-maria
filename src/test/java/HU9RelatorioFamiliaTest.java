import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



class HU9RelatorioFamiliaTest {
@Test
	void test() {
		fail("Not yet implemented");
	}
import br.senai.sc.edu.projetomaria.relatorio.RelatorioFamilia;

}
class HU9RelatorioFamiliaTest {
							
			static RelatorioFamilia service = null;
			
			@BeforeAll
			static void beforeAll() {
				ClassLoader classLoader = HU9RelatorioFamilia.class.getClassLoader();
				Path p = null;
				try {
				   p = Paths.get(classLoader.getResource("dataset/carga-test.csv").toURI());
				} catch (URISyntaxException e) {
					e.printStackTrace();
				}
				
				service = new RelaorioFamilia();
				try {
					service.insertCanal(p);
				} catch (SQLException e) {
					e.printStackTrace();
					fail("Importa��o deu falha!");
				}
			}
			
			// HU1 - UPDATE (BDD 2)
			@Test
			void updateRelatorioFamilia() {
				ClassLoader classLoader = getClass().getClassLoader();
				Path p = null;
				try {
					p = Paths.get(classLoader.getResource("dataset/carga-update.csv").toURI());
				} catch (URISyntaxException e) {
					e.printStackTrace();
				}
				try {
					service.updateRelatorioFamilia(p);
				} catch (SQLException e) {
					e.printStackTrace();
					fail("Update deu ruim!");
				}
			}
			
			// HU - DELETE (BDD 2)
			@Test
			void deleteCanal() {
				ClassLoader classLoader = getClass().getClassLoader();
				Path p = null;
				try {
					p = Paths.get(classLoader.getResource("dataset/carga-delete.csv").toURI());
				} catch (URISyntaxException e) {
					e.printStackTrace();
				}
				try {
					service.deleteRelatorioFamilia(p);
				} catch (SQLException e) {
					e.printStackTrace();
					fail("Deletar deu ruim!");
				}
			}
			
		}
		

	@Test
	void test() {
		fail("Not yet implemented");
	}

}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
