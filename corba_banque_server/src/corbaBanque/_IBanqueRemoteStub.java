package corbaBanque;


/**
* corbaBanque/_IBanqueRemoteStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Banque.idl
* mercredi 20 janvier 2021 13 h 16 WEST
*/

public class _IBanqueRemoteStub extends org.omg.CORBA.portable.ObjectImpl implements corbaBanque.IBanqueRemote
{

  public double conversion (double mt)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("conversion", true);
                $out.write_double (mt);
                $in = _invoke ($out);
                double $result = $in.read_double ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return conversion (mt        );
            } finally {
                _releaseReply ($in);
            }
  } // conversion

  public corbaBanque.Compte getCompte (int code)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getCompte", true);
                $out.write_long (code);
                $in = _invoke ($out);
                corbaBanque.Compte $result = corbaBanque.CompteHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getCompte (code        );
            } finally {
                _releaseReply ($in);
            }
  } // getCompte

  public corbaBanque.Compte[] getComptes ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getComptes", true);
                $in = _invoke ($out);
                corbaBanque.Compte $result[] = corbaBanque.ComptesHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getComptes (        );
            } finally {
                _releaseReply ($in);
            }
  } // getComptes

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:corbaBanque/IBanqueRemote:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _IBanqueRemoteStub
