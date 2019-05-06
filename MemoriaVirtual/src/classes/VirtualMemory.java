package classes;

import java.math.BigInteger;

public class VirtualMemory {
    //dados basicos
    private String [][] enderecoConteudo = new String[6][2];
    private String PDBR;
    private String virtualMemory;
    private String pageTableNumber;
    private String pageNumber;
    private String offset;
    //dados para o diretorio
    private String pageTableNumberLS;
    private String adressDirectory;
    private String contentDirectory;
    //dados para o page table entry
    private String contentDirectoryStart;
    private String pageNumberLS;
    private String adressPageEntry;
    private String contentPageEntry;
    //dados para a memoria fisica
    private String contentPageEntryStart;
    private String adressPhysivalMemory;
    private String contentPhysicalMemory;
    
    //funcoes
    public String completarZerosEsquerda(String string, int tam){
        String aux = "";
        for(int i = string.length(); i<tam; i++){
            aux = "0" + string;
            string = aux; 
        }
        return string;
    }
    
    public String leftShift(String string, int vezes){
        String aux = "";
        for(int i = 0; i<vezes; i++){
            aux = string + "0";
            string = aux;
        }
        return string;
    }
    
    public String[] montarTabelaDiretorio(){
        //hexadecimal para binario
        String bin = new BigInteger(this.getContentDirectory(), 16).toString(2);
        bin = this.completarZerosEsquerda(bin,32);
        String b31_12 = bin.substring(0, 20);
        String b11_7 = bin.substring(20, 25);
        String b6 = bin.substring(25, 26);
        String b5 = bin.substring(26,27);
        String b4_3 = bin.substring(27, 29);
        String b2 = bin.substring(29, 30);
        String b1 = bin.substring(30, 31);
        String b0 = bin.substring(31, 32);
        //binario para hexadecimal
        b31_12 = Integer.toString(Integer.parseInt(b31_12,2),16);
        b31_12 = this.completarZerosEsquerda(b31_12, 5);
        b11_7 = Integer.toString(Integer.parseInt(b11_7,2),16);
        b11_7 = this.completarZerosEsquerda(b11_7, 2);
        
        String result[] = new String[8];
        result[0] = b31_12;
        result[1] = b11_7;
        result[2] = b6;
        result[3] = b5;
        result[4] = b4_3;
        result[5] = b2;
        result[6] = b1;
        result[7] = b0;
        
        return result;
    }
    
    public String[] montarTabelaPageEntry(){
        //hexadecimal para binario
        String bin = new BigInteger(this.getContentPageEntry(), 16).toString(2);
        bin = this.completarZerosEsquerda(bin,32);
        String b31_12 = bin.substring(0, 20);
        String b11_7 = bin.substring(20, 25);
        String b6 = bin.substring(25, 26);
        String b5 = bin.substring(26,27);
        String b4_3 = bin.substring(27, 29);
        String b2 = bin.substring(29, 30);
        String b1 = bin.substring(30, 31);
        String b0 = bin.substring(31, 32);
        //binario para hexadecimal
        b31_12 = Integer.toString(Integer.parseInt(b31_12,2),16);
        b31_12 = this.completarZerosEsquerda(b31_12, 5);
        b11_7 = Integer.toString(Integer.parseInt(b11_7,2),16);
        b11_7 = this.completarZerosEsquerda(b11_7, 2);
        
        String result[] = new String[8];
        result[0] = b31_12;
        result[1] = b11_7;
        result[2] = b6;
        result[3] = b5;
        result[4] = b4_3;
        result[5] = b2;
        result[6] = b1;
        result[7] = b0;
        
        return result;
    }
    
    //get e set
    public String getPdbr() {
        return PDBR;
    }
    public void setPdbr(String pdbr) {
        this.PDBR = pdbr;
    }
    public String getVirtualMemory() {
        return virtualMemory;
    }
    public void setVirtualMemory(String vm) {
        this.virtualMemory = vm;
    }
    public String getPageTableNumber(){
        return pageTableNumber;
    }
    public void setPageTableNumber(String ptn) {
        this.pageTableNumber = ptn;
    }
    public String getPageNumber() {
        return pageNumber;
    }
    public void setPageNumber(String pn) {
        this.pageNumber = pn;
    }
    public String getOffset() {
        return offset;
    }
    public void setOffset(String offset) {
        this.offset = offset;
    }
    public String[][] getEnderecoConteudo() {
        return enderecoConteudo;
    }
    public void setEnderecoConteudo(String[][] enderecoConteudo) {
        this.enderecoConteudo = enderecoConteudo;
    }
    public String getPageTableNumberLS() {
        return pageTableNumberLS;
    }
    public void setPageTableNumberLS(String pageTableNumberLS) {
        this.pageTableNumberLS = pageTableNumberLS;
    }
    public String getAdressDirectory() {
        return adressDirectory;
    }
    public void setAdressDirectory(String adressDirectory) {
        this.adressDirectory = adressDirectory;
    }
    public String getContentDirectory() {
        return contentDirectory;
    }
    public void setContentDirectory(String contentDirectory) {
        this.contentDirectory = contentDirectory;
    }
    public String getContentDirectoryStart() {
        return contentDirectoryStart;
    }
    public void setContentDirectoryStart(String contentDirectoryStart) {
        this.contentDirectoryStart = contentDirectoryStart;
    }
    public String getPageNumberLS() {
        return pageNumberLS;
    }
    public void setPageNumberLS(String pageNumberLS) {
        this.pageNumberLS = pageNumberLS;
    }
    public String getAdressPageEntry() {
        return adressPageEntry;
    }
    public void setAdressPageEntry(String adressPageEntry) {
        this.adressPageEntry = adressPageEntry;
    }
    public String getContentPageEntry() {
        return contentPageEntry;
    }
    public void setContentPageEntry(String contentPageEntry) {
        this.contentPageEntry = contentPageEntry;
    }
    public String getContentPageEntryStart() {
        return contentPageEntryStart;
    }
    public void setContentPageEntryStart(String contentPageEntryStart) {
        this.contentPageEntryStart = contentPageEntryStart;
    }
    public String getAdressPhysivalMemory() {
        return adressPhysivalMemory;
    }
    public void setAdressPhysivalMemory(String adressPhysivalMemory) {
        this.adressPhysivalMemory = adressPhysivalMemory;
    }
    public String getContentPhysicalMemory() {
        return contentPhysicalMemory;
    }
    public void setContentPhysicalMemory(String contentPhysicalMemory) {
        this.contentPhysicalMemory = contentPhysicalMemory;
    }

    public String leftShift() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
