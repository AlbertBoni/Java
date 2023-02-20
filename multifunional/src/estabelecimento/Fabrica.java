package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.copiadora.Xerox;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.LazerJet;
import equipamentos.multifunional.Multifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Copiadora copiadora = new Xerox();
        Digitalizadora digitalizadora = new Scanner();
        Impressora impressora = new LazerJet();

        copiadora.copiar();
        digitalizadora.digitalizar();
        impressora.imprimir();

        Multifuncional multifuncional = new Multifuncional();

        multifuncional.copiar();
        multifuncional.digitalizar();
        multifuncional.imprimir();

        copiadora = multifuncional;
        digitalizadora = multifuncional;
        impressora = multifuncional;

        copiadora.copiar();
        digitalizadora.digitalizar();
        impressora.imprimir();

    }
}
