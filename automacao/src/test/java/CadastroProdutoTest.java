import base.BaseTest;
import pages.CadastroProdutoPage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class CadastroProdutoTest extends BaseTest {
    @Test
    public void validarCadastro(){
        CadastroProdutoPage page = new CadastroProdutoPage( getDriver() );
        page.clickIncLivro()
                .inputId("123")
                .inputTitulo("Titulo1")
                .inputQuant("100")
                .inputAutor("Autor1")
                .clickSubmit();
        String res=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();

        Assert.assertTrue(res.contains("Sucess"));
        
        
        page.clickIncPessoa()
            .inputCpf("111.111.111-12")
            .inputNome("Nome 1")
            .inputGeneroM()
            .clickSubmit();
        String res2=driver.switchTo().alert().getText();
        
        driver.switchTo().alert().accept();
        Assert.assertTrue(res2.contains("Sucess"));
        
        page.clickIncRetirada()
            .inputStatusDev()
            .inputData("10122000")//ddMMYYYY
            .inputPessoa("111.111.111-12")
            .inputLivro("123")
            .clickSubmit();
        String res3=driver.switchTo().alert().getText();
        
        driver.switchTo().alert().accept();
        Assert.assertTrue(res3.contains("Sucess"));
    }
    @Test
    public void validaLista(){
        CadastroProdutoPage page = new CadastroProdutoPage( getDriver() );
        page.clickListRetirada()
            .inputPesquisa("D")
            .clickSubmit();
        page.clickDel();
        String res3=driver.switchTo().alert().getText();
        
        driver.switchTo().alert().accept();
        Assert.assertTrue(res3.contains("Sucess"));
        
    }

    @Test
    public void testaLista(){
        CadastroProdutoPage page = new CadastroProdutoPage( getDriver() );
        page.clickListRetirada()
            .inputPesquisa("D")
            .clickSubmit();
        page.clickAlt()
            .inputStatusRet()
            .inputData("10122000")
            .inputPessoa("111.111.111-12")
            .inputLivro("123")
            .clickSubmit();
        String res3=driver.switchTo().alert().getText();
        
        driver.switchTo().alert().accept();
        Assert.assertTrue(res3.contains("Sucess"));
        
    }
}