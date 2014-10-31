import java.io._
import scala.tools.scalap.scalax.rules.scalasig._

case class MyRecordA()
case class MyRecordB(x: Byte)
case class MyRecordC(x: Short)
case class MyRecordD(x: Int)
case class MyRecordE(x: Long)
case class MyRecordF(x: Float)
case class MyRecordG(x: Double)
case class MyRecordH(x: Boolean)
case class MyRecordI(x: String)
case class MyRecordJ(x: AnyRef)
case class MyRecordK(x: Any)
case class MyRecordL(x: Null)
case class MyRecordM(x: Nothing)
case class MyRecordN(x: Unit)
case class MyRecordO(x: Object)
case class MyRecordP(x: Option[Any])
case class MyRecordQ(x: Option[String])
case class MyRecordR(x: Option[Int])

case class MyRecordS(x: Option[Byte])
case class MyRecordT(x: Option[Short])
case class MyRecordU(x: Option[Long])
case class MyRecordV(x: Option[Float])
case class MyRecordW(x: Option[Double])
case class MyRecordX(x: Option[Boolean])
case class MyRecordY(x: Option[AnyRef])
case class MyRecordZ(x: Option[Null])
case class MyRecordAA(x: Option[Unit])
case class MyRecordAB(x: Option[Object])

case class MyRecordAC(x: List[Int])
case class MyRecordAD(x: Stream[Int])
case class MyRecordAE(x: MyRecordD)
case class MyRecordAF(x: MyRecordAE)
case class MyRecordAG(x: String, y: String)
case class MyRecordAH(x: Option[String], y: Object)
case class MyRecordAI(x: Option[Option[Int]])
case class MyRecordAJ(x: Option[List[Int]])
case class MyRecordAK(x: Option[Option[List[Int]]])
case class MyRecordAL(x: Option[List[Option[Int]]])
case class MyRecordAM(x: Option[List[List[Int]]])
case class MyRecordAN(x: Option[Option[Option[Int]]])
case class MyRecordAO(x: List[List[List[Int]]])





object Main extends App{


  val A = classOf[MyRecordA]
  val B = classOf[MyRecordB]
  val C = classOf[MyRecordC]
  val D = classOf[MyRecordD]
  val E = classOf[MyRecordE]
  val F = classOf[MyRecordF]
  val G = classOf[MyRecordG]
  val H = classOf[MyRecordH]
  val I = classOf[MyRecordI]
  val J = classOf[MyRecordJ]
  val K = classOf[MyRecordK]
  val L = classOf[MyRecordL]
  val M = classOf[MyRecordM]
  val N = classOf[MyRecordN]
  val O = classOf[MyRecordO]
  val P = classOf[MyRecordP]
  val Q = classOf[MyRecordQ]
  val R = classOf[MyRecordR]

  val S = classOf[MyRecordS]
  val T = classOf[MyRecordT]
  val U = classOf[MyRecordU]
  val V = classOf[MyRecordV]
  val W = classOf[MyRecordW]
  val X = classOf[MyRecordX]
  val Y = classOf[MyRecordY]
  val Z = classOf[MyRecordZ]
  val AA = classOf[MyRecordAA]
  val AB = classOf[MyRecordAB]
  val AC = classOf[MyRecordAC]
  val AD = classOf[MyRecordAD]
  val AE = classOf[MyRecordAE]
  val AF = classOf[MyRecordAF]
  val AG = classOf[MyRecordAG]
  val AH = classOf[MyRecordAH]
  val AI = classOf[MyRecordAI]
  val AJ = classOf[MyRecordAJ]
  val AK = classOf[MyRecordAK]
  val AL = classOf[MyRecordAL]
  val AM = classOf[MyRecordAM]
  val AN = classOf[MyRecordAN]
  val AO = classOf[MyRecordAO]



  val classes = List(A, B, C, D, E, F, G, H, I, J, K , L, M, N, O, P, Q, R)
  //val classes = List(S, T, U, V, W, X, Y, Z, AA, AB, AC, AD, AE, AF, AG, AH)
  //val classes = List(D)

  val scalaSigs = classes.map(cls => Map("name" -> cls.getSimpleName, "scalaSig" -> ScalaSigParser.parse(cls)))

  for (scalaSig <- scalaSigs) {   
    Some(new PrintWriter("""scalaSigs/2.9.1"""+scalaSig("name"))).foreach{pw => pw.write(scalaSig("scalaSig").toString
); pw.close} 
  }
}
