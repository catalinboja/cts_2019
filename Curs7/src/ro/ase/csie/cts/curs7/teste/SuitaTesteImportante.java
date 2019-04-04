package ro.ase.csie.cts.curs7.teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(TesteImportante.class)
@SuiteClasses({ TestCaseColectie.class })
public class SuitaTesteImportante {

}
