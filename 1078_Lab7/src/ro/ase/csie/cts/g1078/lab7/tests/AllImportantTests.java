package ro.ase.csie.cts.g1078.lab7.tests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(ImportantTests.class)
@SuiteClasses({ TestCaseStudentExams.class, TestCaseStudentMethods.class })
public class AllImportantTests {

}
