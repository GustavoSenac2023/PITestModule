package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
public class CadastroProdutoPage extends BasePage {
    @FindBy(id = "btincl")
    private WebElement btnIncL;
    @FindBy(id = "btnll")
    private WebElement btnListL;
    @FindBy(id = "btnincp")
    private WebElement btnIncP;
    @FindBy(id = "btnlp")
    private WebElement btnListP;
    @FindBy(id= "btnincr")
    private WebElement btnIncR;
    @FindBy(id = "btnlr")
    private WebElement btnListR;
    @FindBy(id = "pesquisa")
    private WebElement inputSearch;
    @FindBy(id = "del")
    private WebElement btnDel;
    @FindBy(id = "op")
    private WebElement btnSubmit;
    @FindBy(id = "titulo")
    private WebElement inputTitulo;
    @FindBy(id = "cod")
    private WebElement inputId;
    @FindBy(id = "quant")
    private WebElement inputQuant;
    @FindBy(id = "cpf")
    private WebElement inputCpf;
    @FindBy(id = "autor")
    private WebElement inputAutor;
    @FindBy(id = "nome")
    private WebElement inputNome;
    @FindBy(id = "option1")
    private WebElement inputGeneroM;
    @FindBy(id = "option2")
    private WebElement inputGeneroF;
    @FindBy(id = "data")
    private WebElement inputData;
    @FindBy(id = "fk_pessoa")
    private WebElement inputPessoa;
    @FindBy(id = "fk_livro")
    private WebElement inputLivro;
    @FindBy(id = "optionA")
    private WebElement inputRet;
    @FindBy(id = "optionB")
    private WebElement inputDev;
    
    public CadastroProdutoPage(WebDriver driver) {
        super(driver);
    }

    public CadastroProdutoPage inputCpf(String cpf){
        inputCpf.sendKeys(cpf);
        return this;
    }

    public CadastroProdutoPage inputQuant(String quant){
        inputQuant.sendKeys(quant);
        return this;
    }
    
    public CadastroProdutoPage inputId(String codigo){
        inputId.sendKeys(codigo);
        return this;
    }

    public CadastroProdutoPage inputTitulo (String titulo){
        inputTitulo.sendKeys(titulo);
        return this;
    }
    public CadastroProdutoPage inputAutor (String autor){
        inputAutor.sendKeys(autor);
        return this;
    }
    public CadastroProdutoPage inputNome (String nome){
        inputNome.sendKeys(nome);
        return this;
    }

    public CadastroProdutoPage inputGeneroM (){
        inputGeneroM.click();
        return this;
    }

    public CadastroProdutoPage inputGeneroF (){
        inputGeneroF.click();
        return this;
    }
    
    public CadastroProdutoPage inputStatusRet (){
        inputRet.click();
        return this;
    }

    public CadastroProdutoPage inputStatusDev (){
        inputDev.click();
        return this;
    }

    public CadastroProdutoPage inputData (String data){
        inputData.sendKeys(data);
        return this;
    }
    public CadastroProdutoPage inputPessoa (String pessoa){
        inputPessoa.sendKeys(pessoa);
        return this;
    }
    public CadastroProdutoPage inputLivro (String livro){
        inputLivro.sendKeys(livro);
        return this;
    }

    public CadastroProdutoPage inputPesquisa (String word){
        inputSearch.sendKeys(word);
        return this;
    }

    public CadastroProdutoPage clickIncLivro(){
        btnIncL.click();
        return this;
    }
    public CadastroProdutoPage clickIncPessoa(){
        btnIncP.click();
        return this;
    }
    public CadastroProdutoPage clickIncRetirada(){
        btnIncR.click();
        return this;
    }

    public CadastroProdutoPage clickListRetirada(){
        btnListR.click();
        return this;
    }
    public CadastroProdutoPage clickSubmit(){
        btnSubmit.click();
        return this;
    }
    public CadastroProdutoPage clickDel(){
        btnDel.click();
        return this;
    }
    public String buscarResultadoCadastro() {
        return driver.getPageSource();
    }
}


