def formatArgs(args: Array[String]) = args.mkString(" ")

val res = formatArgs(Array("zero", "one", "two"))
assert(res == "zero\none\ntwo")

println(formatArgs(args))