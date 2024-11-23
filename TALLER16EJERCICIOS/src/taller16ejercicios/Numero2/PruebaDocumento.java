/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16ejercicios.Numero2;

/**
 *
 * @author yoven
 */
// Aqui pruebo la exportacion de documentos en diferentes formatos
public class PruebaDocumento {
    public static void main(String[] args) {
        // Exporto un documento en PDF
        Documento pdf = new DocumentoPDF();
        pdf.exportar();

        // Exporto un documento en Word
        Documento word = new DocumentoWord();
        word.exportar();

        // Exporto un documento en Excel
        Documento excel = new DocumentoExcel();
        excel.exportar();
    }
}
