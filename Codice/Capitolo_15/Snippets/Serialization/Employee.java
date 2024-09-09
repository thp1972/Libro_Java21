package Serialization;

import java.io.*;

/**
 * Modella un impiegato.
 *
 * @author Pellegrino Principe
 * @serial include
 */
public class Employee implements Serializable
{
    private static final long serialVersionUID = 17890L;

    /**
     * Identificativo dell'impiegato.
     *
     * @serial
     */
    private int codeId;

    /**
     * Nome completo dell'impiegato.
     *
     * @serial
     */
    private String fullName;

    /**
     * @serialField codeId int identificativo dell'impiegato
     * @serialField fullName String nome completo dell'impiegato
     */
    private static final ObjectStreamField[] serialPersistentFields =
            {
                    new ObjectStreamField("codeId", Integer.class),
                    new ObjectStreamField("fullName", String.class)
            };

    /**
     * Salva lo stato di un {@code Employee} in uno stream di output.
     *
     * @serialData Scrive il {@link #codeId} e il {@link #fullName} di un {@code Employee}
     */
    private void writeObject(ObjectOutputStream out) throws IOException
    {
        ObjectOutputStream.PutField fields = out.putFields();
        fields.put("codeId", codeId);
        fields.put("fullName", fullName);
        out.writeFields();
    }

    /**
	 * Ripristina lo stato di un {@code Employee} da uno stream di input.
	 *
     * @serialData Legge il {@link #codeId} e il {@link #fullName} di un {@code Employee}
     */
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
    {
        ObjectInputStream.GetField fields = in.readFields();
        codeId = fields.get("codeId", -1);
        fullName = (String) fields.get("fullName", "");
    }
}
