package corbaBanque;


/**
* corbaBanque/Compte.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Banque.idl
* mercredi 20 janvier 2021 13 h 42 WEST
*/

public final class Compte implements org.omg.CORBA.portable.IDLEntity
{
  public int code = (int)0;
  public double solde = (double)0;

  public Compte ()
  {
  } // ctor

  public Compte (int _code, double _solde)
  {
    code = _code;
    solde = _solde;
  } // ctor

} // class Compte
