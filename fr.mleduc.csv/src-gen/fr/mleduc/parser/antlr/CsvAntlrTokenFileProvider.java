/*
 * generated by Xtext 2.10.0
 */
package fr.mleduc.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class CsvAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("fr/mleduc/parser/antlr/internal/InternalCsv.tokens");
	}
}
