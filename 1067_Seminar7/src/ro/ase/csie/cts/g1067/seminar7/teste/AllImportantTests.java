package ro.ase.csie.cts.g1067.seminar7.teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(CategorieTesteImportante.class)
@SuiteClasses({ TestCaseAlteMetode.class, TestCaseStudent.class })
public class AllImportantTests {

}
