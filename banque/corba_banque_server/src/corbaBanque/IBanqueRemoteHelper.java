package corbaBanque;


/**
* corbaBanque/IBanqueRemoteHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Banque.idl
* mercredi 20 janvier 2021 13 h 16 WEST
*/

abstract public class IBanqueRemoteHelper
{
  private static String  _id = "IDL:corbaBanque/IBanqueRemote:1.0";

  public static void insert (org.omg.CORBA.Any a, corbaBanque.IBanqueRemote that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static corbaBanque.IBanqueRemote extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (corbaBanque.IBanqueRemoteHelper.id (), "IBanqueRemote");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static corbaBanque.IBanqueRemote read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_IBanqueRemoteStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, corbaBanque.IBanqueRemote value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static corbaBanque.IBanqueRemote narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof corbaBanque.IBanqueRemote)
      return (corbaBanque.IBanqueRemote)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      corbaBanque._IBanqueRemoteStub stub = new corbaBanque._IBanqueRemoteStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static corbaBanque.IBanqueRemote unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof corbaBanque.IBanqueRemote)
      return (corbaBanque.IBanqueRemote)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      corbaBanque._IBanqueRemoteStub stub = new corbaBanque._IBanqueRemoteStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
