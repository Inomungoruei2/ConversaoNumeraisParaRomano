import org.junit.Assert;
import org.junit.Test;

public class ConverteNumeraisParaRomanoTest {

	@Test
	public void DeveAceitarConverterUmDigitoNumerico() {

		ConverteNumeraisParaRomano conv = new ConverteNumeraisParaRomano();

		conv.setValorNumerico(5);

		Assert.assertEquals("V", conv.NumeroRomanos());

	}

	
	@Test
	public void DeveAceitarConverterDoisDigitoNumerico() {

		ConverteNumeraisParaRomano conv = new ConverteNumeraisParaRomano();

		conv.setValorNumerico(25);

		Assert.assertEquals("XXV", conv.NumeroRomanos());

	}
	
	
	@Test
	public void DeveAceitarConverterTresDigitoNumerico() {

		ConverteNumeraisParaRomano conv = new ConverteNumeraisParaRomano();

		conv.setValorNumerico(689);

		Assert.assertEquals("DCLXXXIX", conv.NumeroRomanos());

	}
	
	

	
}
