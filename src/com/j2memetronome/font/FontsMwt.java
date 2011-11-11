package com.j2memetronome.font;

/**

 * This maping values were created by microfont-maker tool from Micro Window Toolkit http://j2me-mwt.sourceforge.net/
 * @author dmartins
 */
public interface FontsMwt {

    //#if QVGA
//#     int[] OUT_WIDTHS = {13, 12, 11, 12, 12, 11, 11, 14, 8, 10, 13, 12, 16, 14, 11, 12, 11, 13, 11, 12, 13, 13, 17, 13, 12, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 6, 14, 12, 11, 16, 11, 11, 8, 8, 5, 11, 11, 8, 8, 8, 8, 6, 6, 10, 10, 6, 6, 13, 13, 12, 13, 11, 8, 11, 13, 11};
//#     char[] OUT_CHARSET = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '!', '@', '#', '$', '%', '&', '*', '(', ')', '-', '=', '+', '{', '}', '[', ']', ':', ';', '?', '/', ',', '.', '�', '�', '�', '�', '�', '�', '�', '�', '�'};
//#     char[] OUT_CHARSETU = {'\u0041', '\u0042', '\u0043', '\u0044', '\u0045', '\u0046', '\u0047', '\u0048', '\u0049', '\u004a', '\u004b', '\u004c', '\u004d', '\u004e', '\u004f', '\u0050', '\u0051', '\u0052', '\u0053', '\u0054', '\u0055', '\u0056', '\u0057', '\u0058', '\u0059', '\u005a', '\u0030', '\u0031', '\u0032', '\u0033', '\u0034', '\u0035', '\u0036', '\u0037', '\u0038', '\u0039', '\u0021', '\u0040', '\u0023', '\u0024', '\u0025', '\u0026', '\u002a', '\u0028', '\u0029', '\u002d', '\u003d', '\u002b', '\u007b', '\u007d', '\u005b', '\u005d', '\u003a', '\u003b', '\u003f', '\u002f', '\u002c', '\u002e', '\u00c1', '\u00c3', '\u00c9', '\u00c0', '\u00d5', '\u00cd', '\u00d3', '\u00da', '\u00c7'};
    //#else
    int[] OUT_WIDTHS = {13, 12, 11, 12, 12, 11, 11, 14, 8, 10, 13, 12, 16, 14, 11, 12, 11, 13, 11, 12, 13, 13, 17, 13, 12, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 6, 14, 12, 11, 16, 11, 11, 8, 8, 5, 11, 11, 8, 8, 8, 8, 6, 6, 10, 10, 6, 6, 13, 13, 12, 13, 11, 8, 11, 13, 11};
    char[] OUT_CHARSET = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '!', '@', '#', '$', '%', '&', '*', '(', ')', '-', '=', '+', '{', '}', '[', ']', ':', ';', '?', '/', ',', '.', '�', '�', '�', '�', '�', '�', '�', '�', '�'};
    char[] OUT_CHARSETU = {'\u0041', '\u0042', '\u0043', '\u0044', '\u0045', '\u0046', '\u0047', '\u0048', '\u0049', '\u004a', '\u004b', '\u004c', '\u004d', '\u004e', '\u004f', '\u0050', '\u0051', '\u0052', '\u0053', '\u0054', '\u0055', '\u0056', '\u0057', '\u0058', '\u0059', '\u005a', '\u0030', '\u0031', '\u0032', '\u0033', '\u0034', '\u0035', '\u0036', '\u0037', '\u0038', '\u0039', '\u0021', '\u0040', '\u0023', '\u0024', '\u0025', '\u0026', '\u002a', '\u0028', '\u0029', '\u002d', '\u003d', '\u002b', '\u007b', '\u007d', '\u005b', '\u005d', '\u003a', '\u003b', '\u003f', '\u002f', '\u002c', '\u002e', '\u00c1', '\u00c3', '\u00c9', '\u00c0', '\u00d5', '\u00cd', '\u00d3', '\u00da', '\u00c7'};
    //#endif
    
    int[] GREEN_NUMBERS_WIDTHS = {25, 13, 25, 25, 25, 25, 25, 25, 25, 25};
    char[] GREEN_NUMBERS_CHARSET = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    char[] GREEN_NUMBERS_CHARSETU = {'\u0030', '\u0031', '\u0032', '\u0033', '\u0034', '\u0035', '\u0036', '\u0037', '\u0038', '\u0039'};
    int[] RED_NUMBERS_WIDTHS = {13};
    char[] RED_NUMBERS_CHARSET = {'1'};
    char[] RED_NUMBERS_CHARSETU = {'\u0031'};
    
    // Font Arial
    //#if QVGA
//#     int[] ARIAL_WIDTHS = {11, 11, 12, 12, 11, 10, 13, 12, 5, 8, 11, 9, 15, 12, 13, 11, 13, 12, 11, 10, 12, 11, 15, 11, 11, 10, 9, 9, 8, 9, 9, 5, 9, 9, 3, 3, 8, 3, 15, 9, 9, 9, 9, 5, 8, 5, 9, 9, 13, 8, 9, 8, 12, 8, 10, 8, 5, 5, 5, 5, 5, 10, 10, 5, 9, 8, 5, 6, 5, 5, 5, 5, 10, 10, 5, 6, 6, 5, 5, 11, 15, 9, 9, 17, 5, 6, 5, 9, 11, 9, 11, 9, 11, 9, 11, 9, 11, 9, 11, 9, 11, 9, 5, 5, 5, 5, 5, 5, 13, 9, 13, 9, 13, 9, 13, 9, 12, 9, 12, 9, 12, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
//#     char[] ARIAL_CHARSET = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '�', '�', '~', '^', '�', '`', ',', '.', ';', '<', '>', ':', '?', '�', '/', '�', '[', '{', ']', '}', '+', '=', '-', '*', '�', '(', ')', '&', '%', '$', '#', '@', '!', '"', '-', '_', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
//#     char[] ARIAL_CHARSETU = {'\u0041', '\u0042', '\u0043', '\u0044', '\u0045', '\u0046', '\u0047', '\u0048', '\u0049', '\u004a', '\u004b', '\u004c', '\u004d', '\u004e', '\u004f', '\u0050', '\u0051', '\u0052', '\u0053', '\u0054', '\u0055', '\u0056', '\u0057', '\u0058', '\u0059', '\u005a', '\u0061', '\u0062', '\u0063', '\u0064', '\u0065', '\u0066', '\u0067', '\u0068', '\u0069', '\u006a', '\u006b', '\u006c', '\u006d', '\u006e', '\u006f', '\u0070', '\u0071', '\u0072', '\u0073', '\u0074', '\u0075', '\u0076', '\u0077', '\u0078', '\u0079', '\u007a', '\u00c7', '\u00e7', '\u007e', '\u005e', '\u00b4', '\u0060', '\u002c', '\u002e', '\u003b', '\u003c', '\u003e', '\u003a', '\u003f', '\u00b0', '\u002f', '\u00aa', '\u005b', '\u007b', '\u005d', '\u007d', '\u002b', '\u003d', '\u002d', '\u002a', '\u00ba', '\u0028', '\u0029', '\u0026', '\u0025', '\u0024', '\u0023', '\u0040', '\u0021', '\u0022', '\u002d', '\u005f', '\u00c3', '\u00e3', '\u00c2', '\u00e2', '\u00c1', '\u00e1', '\u00c0', '\u00e0', '\u00ca', '\u00ea', '\u00c9', '\u00e9', '\u00c8', '\u00e8', '\u00ce', '\u00ee', '\u00cd', '\u00ed', '\u00cc', '\u00ec', '\u00d5', '\u00f5', '\u00d4', '\u00f4', '\u00d3', '\u00f3', '\u00d2', '\u00f2', '\u00db', '\u00fb', '\u00da', '\u00fa', '\u00d9', '\u00f9', '\u0030', '\u0031', '\u0032', '\u0033', '\u0034', '\u0035', '\u0036', '\u0037', '\u0038', '\u0039'};
    //#else
    int[] ARIAL_WIDTHS = {7, 7, 7, 7, 6, 6, 7, 7, 3, 5, 7, 6, 8, 7, 7, 6, 7, 7, 6, 5, 7, 6, 9, 7, 6, 6, 5, 6, 5, 6, 5, 3, 6, 6, 3, 3, 5, 3, 9, 6, 6, 6, 6, 4, 5, 3, 6, 5, 7, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 3, 9, 5, 5, 8, 7, 4, 3, 3, 5, 3, 5, 5, 4, 4, 3, 3, 3, 3, 3, 6, 3, 5, 5, 3, 3, 7, 5, 7, 5, 6, 5, 7, 5, 7, 6, 3, 3, 7, 6, 7, 6, 7, 5};
    char[] ARIAL_CHARSET = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '!', '@', '#', '$', '%', '&', '*', '(', ')', '_', '-', '=', '+', '{', '}', '[', ']', '|', ':', ';', '?', '/', '<', '>', ',', '.', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�'};
    char[] ARIAL_CHARSETU = {'\u0041', '\u0042', '\u0043', '\u0044', '\u0045', '\u0046', '\u0047', '\u0048', '\u0049', '\u004a', '\u004b', '\u004c', '\u004d', '\u004e', '\u004f', '\u0050', '\u0051', '\u0052', '\u0053', '\u0054', '\u0055', '\u0056', '\u0057', '\u0058', '\u0059', '\u005a', '\u0061', '\u0062', '\u0063', '\u0064', '\u0065', '\u0066', '\u0067', '\u0068', '\u0069', '\u006a', '\u006b', '\u006c', '\u006d', '\u006e', '\u006f', '\u0070', '\u0071', '\u0072', '\u0073', '\u0074', '\u0075', '\u0076', '\u0077', '\u0078', '\u0079', '\u007a', '\u0030', '\u0031', '\u0032', '\u0033', '\u0034', '\u0035', '\u0036', '\u0037', '\u0038', '\u0039', '\u0021', '\u0040', '\u0023', '\u0024', '\u0025', '\u0026', '\u002a', '\u0028', '\u0029', '\u005f', '\u002d', '\u003d', '\u002b', '\u007b', '\u007d', '\u005b', '\u005d', '\u007c', '\u003a', '\u003b', '\u003f', '\u002f', '\u003c', '\u003e', '\u002c', '\u002e', '\u00c1', '\u00e1', '\u00c3', '\u00e3', '\u00c9', '\u00e9', '\u00c0', '\u00e0', '\u00d5', '\u00f5', '\u00cd', '\u00ed', '\u00d3', '\u00f3', '\u00da', '\u00fa', '\u00c7', '\u00e7'};
    //#endif
    
    
    // Font TW
    //#if QVGA
//#     int[] TW_WIDTHS = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 5};
//#     char[] TW_CHARSET = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '/'};
//#     char[] TW_CHARSETU = {'\u0030', '\u0031', '\u0032', '\u0033', '\u0034', '\u0035',
//#         '\u0036', '\u0037', '\u0038', '\u0039', '\u002f'};
    //#else
    int[] TW_WIDTHS = {10, 7, 8, 9, 7, 7, 10, 9, 4, 6, 9, 6, 11, 10, 10, 7, 10, 8, 7, 7, 9, 9, 11, 9, 8, 8, 7, 7, 6, 7, 7, 4, 7, 7, 3, 3, 7, 3, 11, 7, 7, 7, 7, 4, 6, 4, 7, 7, 11, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 5};
    char[] TW_CHARSET = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '/'};
    char[] TW_CHARSETU = {'\u0041', '\u0042', '\u0043', '\u0044', '\u0045', '\u0046', '\u0047', '\u0048', '\u0049', '\u004a', '\u004b', '\u004c', '\u004d', '\u004e', '\u004f', '\u0050', '\u0051', '\u0052', '\u0053', '\u0054', '\u0055', '\u0056', '\u0057', '\u0058', '\u0059', '\u005a', '\u0061', '\u0062', '\u0063', '\u0064', '\u0065', '\u0066', '\u0067', '\u0068', '\u0069', '\u006a', '\u006b', '\u006c', '\u006d', '\u006e', '\u006f', '\u0070', '\u0071', '\u0072', '\u0073', '\u0074', '\u0075', '\u0076', '\u0077', '\u0078', '\u0079', '\u007a', '\u0030', '\u0031', '\u0032', '\u0033', '\u0034', '\u0035', '\u0036', '\u0037', '\u0038', '\u0039', '\u002f'};
    //#endif
}
