/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.gdal.ogr;

import org.gdal.osr.SpatialReference;

public class ogr implements ogrConstants {
  public static void UseExceptions() {
    ogrJNI.UseExceptions();
  }

  public static void DontUseExceptions() {
    ogrJNI.DontUseExceptions();
  }

  public static Geometry CreateGeometryFromWkb(byte[] nLen, SpatialReference reference) {
    long cPtr = ogrJNI.CreateGeometryFromWkb__SWIG_0(nLen, SpatialReference.getCPtr(reference), reference);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public static Geometry CreateGeometryFromWkb(byte[] nLen) {
    long cPtr = ogrJNI.CreateGeometryFromWkb__SWIG_1(nLen);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public static Geometry CreateGeometryFromWkt(String val, SpatialReference reference) {
    long cPtr = ogrJNI.CreateGeometryFromWkt__SWIG_0(val, SpatialReference.getCPtr(reference), reference);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public static Geometry CreateGeometryFromWkt(String val) {
    long cPtr = ogrJNI.CreateGeometryFromWkt__SWIG_1(val);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public static Geometry CreateGeometryFromGML(String input_string) {
    long cPtr = ogrJNI.CreateGeometryFromGML(input_string);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public static Geometry CreateGeometryFromJson(String input_string) {
    long cPtr = ogrJNI.CreateGeometryFromJson(input_string);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public static Geometry BuildPolygonFromEdges(Geometry hLineCollection, int bBestEffort, int bAutoClose, double dfTolerance) {
    long cPtr = ogrJNI.BuildPolygonFromEdges__SWIG_0(Geometry.getCPtr(hLineCollection), hLineCollection, bBestEffort, bAutoClose, dfTolerance);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public static Geometry BuildPolygonFromEdges(Geometry hLineCollection, int bBestEffort, int bAutoClose) {
    long cPtr = ogrJNI.BuildPolygonFromEdges__SWIG_1(Geometry.getCPtr(hLineCollection), hLineCollection, bBestEffort, bAutoClose);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public static Geometry BuildPolygonFromEdges(Geometry hLineCollection, int bBestEffort) {
    long cPtr = ogrJNI.BuildPolygonFromEdges__SWIG_2(Geometry.getCPtr(hLineCollection), hLineCollection, bBestEffort);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public static Geometry BuildPolygonFromEdges(Geometry hLineCollection) {
    long cPtr = ogrJNI.BuildPolygonFromEdges__SWIG_3(Geometry.getCPtr(hLineCollection), hLineCollection);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public static Geometry ApproximateArcAngles(double dfCenterX, double dfCenterY, double dfZ, double dfPrimaryRadius, double dfSecondaryAxis, double dfRotation, double dfStartAngle, double dfEndAngle, double dfMaxAngleStepSizeDegrees) {
    long cPtr = ogrJNI.ApproximateArcAngles(dfCenterX, dfCenterY, dfZ, dfPrimaryRadius, dfSecondaryAxis, dfRotation, dfStartAngle, dfEndAngle, dfMaxAngleStepSizeDegrees);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public static Geometry ForceToPolygon(Geometry geom_in) {
    long cPtr = ogrJNI.ForceToPolygon(Geometry.getCPtr(geom_in), geom_in);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public static Geometry ForceToMultiPolygon(Geometry geom_in) {
    long cPtr = ogrJNI.ForceToMultiPolygon(Geometry.getCPtr(geom_in), geom_in);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public static Geometry ForceToMultiPoint(Geometry geom_in) {
    long cPtr = ogrJNI.ForceToMultiPoint(Geometry.getCPtr(geom_in), geom_in);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public static Geometry ForceToMultiLineString(Geometry geom_in) {
    long cPtr = ogrJNI.ForceToMultiLineString(Geometry.getCPtr(geom_in), geom_in);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public static int GetDriverCount() {
    return ogrJNI.GetDriverCount();
  }

  public static int GetOpenDSCount() {
    return ogrJNI.GetOpenDSCount();
  }

  public static int SetGenerate_DB2_V72_BYTE_ORDER(int bGenerate_DB2_V72_BYTE_ORDER) {
    return ogrJNI.SetGenerate_DB2_V72_BYTE_ORDER(bGenerate_DB2_V72_BYTE_ORDER);
  }

  public static void RegisterAll() {
    ogrJNI.RegisterAll();
  }

  public static String GeometryTypeToName(int eType) {
    return ogrJNI.GeometryTypeToName(eType);
  }

  public static String GetFieldTypeName(int type) {
    return ogrJNI.GetFieldTypeName(type);
  }

  public static DataSource GetOpenDS(int ds_number) {
    long cPtr = ogrJNI.GetOpenDS(ds_number);
    return (cPtr == 0) ? null : new DataSource(cPtr, false);
  }

  public static DataSource Open(String utf8_path, int update) {
    long cPtr = ogrJNI.Open__SWIG_0(utf8_path, update);
    return (cPtr == 0) ? null : new DataSource(cPtr, true);
  }

  public static DataSource Open(String utf8_path) {
    long cPtr = ogrJNI.Open__SWIG_1(utf8_path);
    return (cPtr == 0) ? null : new DataSource(cPtr, true);
  }

  public static DataSource OpenShared(String utf8_path, int update) {
    long cPtr = ogrJNI.OpenShared__SWIG_0(utf8_path, update);
    return (cPtr == 0) ? null : new DataSource(cPtr, true);
  }

  public static DataSource OpenShared(String utf8_path) {
    long cPtr = ogrJNI.OpenShared__SWIG_1(utf8_path);
    return (cPtr == 0) ? null : new DataSource(cPtr, true);
  }

  public static Driver GetDriverByName(String name) {
    long cPtr = ogrJNI.GetDriverByName(name);
    return (cPtr == 0) ? null : new Driver(cPtr, false);
  }

  public static Driver GetDriver(int driver_number) {
    long cPtr = ogrJNI.GetDriver(driver_number);
    return (cPtr == 0) ? null : new Driver(cPtr, false);
  }

  public static java.util.Vector GeneralCmdLineProcessor(java.util.Vector papszArgv, int nOptions) {
    return ogrJNI.GeneralCmdLineProcessor__SWIG_0(papszArgv, nOptions);
  }

  public static java.util.Vector GeneralCmdLineProcessor(java.util.Vector papszArgv) {
    return ogrJNI.GeneralCmdLineProcessor__SWIG_1(papszArgv);
  }



    /* Uninstanciable class */
    private ogr()
    {
    }

    public static String[] GeneralCmdLineProcessor(String[] args, int nOptions)
    {
        java.util.Vector vArgs = new java.util.Vector();
        int i;
        for(i=0;i<args.length;i++)
            vArgs.addElement(args[i]);

        vArgs = GeneralCmdLineProcessor(vArgs, nOptions);
        java.util.Enumeration eArgs = vArgs.elements();
        args = new String[vArgs.size()];
        i = 0;
        while(eArgs.hasMoreElements())
        {
            String arg = (String)eArgs.nextElement();
            args[i++] = arg;
        }

        return args;
    }

    public static String[] GeneralCmdLineProcessor(String[] args)
    {
        return GeneralCmdLineProcessor(args, 0);
    }

    public static DataSource Open(String filename, boolean update)
    {
        return Open(filename, (update)?1:0);
    }

}
