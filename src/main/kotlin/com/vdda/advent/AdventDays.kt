package com.vdda.advent

import org.springframework.shell.standard.ShellComponent
import org.springframework.shell.standard.ShellMethod
import org.springframework.shell.standard.ShellOption
import java.io.File
import java.io.InputStream
import kotlin.math.ceil
import kotlin.math.sqrt

@ShellComponent
class AdventDays {

    @ShellMethod("Calculate the answer for Day 1: pt 1")
    fun day01_1(
            @ShellOption(defaultValue = "181445682966897848665963472661939865313976877194312684993521259486517527961396717561854825453963181134379574918373213732184697746668399631642622373684425326112585283946462323363991753895647177797691214784149215198715986947573668987188746878678399624533792551651335979847131975965677957755571358934665327487287312467771187981424785514785421781781976477326712674311994735947987383516699897916595433228294198759715959469578766739518475118771755787196238772345762941477359483456641194685333528329581113788599843621326313592354167846466415943566183192946217689936174884493199368681514958669615226362538622898367728662941275658917124167353496334664239539753835439929664552886538885727235662548783529353611441231681613535447417941911479391558481443933134283852879511395429489152435996669232681215627723723565872291296878528334773391626672491878762288953597499218397146685679387438634857358552943964839321464529237533868734473777756775687759355878519113426969197211824325893376812556798483325994128743242544899625215765851923959798197562831313891371735973761384464685316273343541852758525318144681364492173465174512856618292785483181956548813344752352933634979165667651165776587656468598791994573513652324764687515345959621493346623821965554755615219855842969932269414839446887613738174567989512857785566352285988991946436148652839391593178736624957214917527759574235133666461988355855613377789115472297915429318142824465141688559333787512328799783539285826471818279818457674417354335454395644435889386297695625378256613558911695145397779576526397241795181294322797687168326696497256684943829666672341162656479563522892141714998477865114944671225898297338685958644728534192317628618817551492975251364233974374724968483637518876583946828819994321129556511537619253381981544394112184655586964655164192552352534626295996968762388827294873362719636616182786976922445125551927969267591395292198155775434997827738862786341543524544822321112131815475829945625787561369956264826651461575948462782869972654343749617939132353399334744265286151177931594514857563664329299713436914721119746932159456287267887878779218815883191236858656959258484139254446341") input: String
    ): Int {
        println("Input: \n$input")

        val inputBytes = input.map { c -> c.toString().toByte() }

        val inputBytesOffset = inputBytes.subList(1, inputBytes.size) + inputBytes[0]

        val ifEqual = inputBytes.zip(inputBytesOffset) { a, b -> if (a == b) a else 0 }

        return ifEqual.sum()
    }

    @ShellMethod("Calculate the answer for Day 1: pt 2")
    fun day01_2(
            @ShellOption(defaultValue = "181445682966897848665963472661939865313976877194312684993521259486517527961396717561854825453963181134379574918373213732184697746668399631642622373684425326112585283946462323363991753895647177797691214784149215198715986947573668987188746878678399624533792551651335979847131975965677957755571358934665327487287312467771187981424785514785421781781976477326712674311994735947987383516699897916595433228294198759715959469578766739518475118771755787196238772345762941477359483456641194685333528329581113788599843621326313592354167846466415943566183192946217689936174884493199368681514958669615226362538622898367728662941275658917124167353496334664239539753835439929664552886538885727235662548783529353611441231681613535447417941911479391558481443933134283852879511395429489152435996669232681215627723723565872291296878528334773391626672491878762288953597499218397146685679387438634857358552943964839321464529237533868734473777756775687759355878519113426969197211824325893376812556798483325994128743242544899625215765851923959798197562831313891371735973761384464685316273343541852758525318144681364492173465174512856618292785483181956548813344752352933634979165667651165776587656468598791994573513652324764687515345959621493346623821965554755615219855842969932269414839446887613738174567989512857785566352285988991946436148652839391593178736624957214917527759574235133666461988355855613377789115472297915429318142824465141688559333787512328799783539285826471818279818457674417354335454395644435889386297695625378256613558911695145397779576526397241795181294322797687168326696497256684943829666672341162656479563522892141714998477865114944671225898297338685958644728534192317628618817551492975251364233974374724968483637518876583946828819994321129556511537619253381981544394112184655586964655164192552352534626295996968762388827294873362719636616182786976922445125551927969267591395292198155775434997827738862786341543524544822321112131815475829945625787561369956264826651461575948462782869972654343749617939132353399334744265286151177931594514857563664329299713436914721119746932159456287267887878779218815883191236858656959258484139254446341") input: String
    ): Int {
        println("Input: \n$input")

        val inputBytes = input.map { c -> c.toString().toByte() }

        val inputBytesOffset = inputBytes.subList(inputBytes.size / 2, inputBytes.size) + inputBytes.subList(0, inputBytes.size / 2)

        return inputBytes.zip(inputBytesOffset) { a, b -> if (a == b) a else 0 }.sum()
    }

    @ShellMethod("Calculate the answer for Day 2: pt 1")
    fun day02_1(
            @ShellOption(defaultValue = "104\t240\t147\t246\t123\t175\t372\t71\t116\t230\t260\t118\t202\t270\t277\t292\n" +
                    "740\t755\t135\t205\t429\t822\t844\t90\t828\t115\t440\t805\t526\t91\t519\t373\n" +
                    "1630\t991\t1471\t1294\t52\t1566\t50\t1508\t1367\t1489\t55\t547\t342\t512\t323\t51\n" +
                    "1356\t178\t1705\t119\t1609\t1409\t245\t292\t1434\t694\t405\t1692\t247\t193\t1482\t1407\n" +
                    "2235\t3321\t3647\t212\t1402\t3711\t3641\t1287\t2725\t692\t1235\t3100\t123\t144\t104\t101\n" +
                    "1306\t1224\t1238\t186\t751\t734\t1204\t1275\t366\t149\t1114\t166\t1118\t239\t153\t943\n" +
                    "132\t1547\t1564\t512\t2643\t2376\t2324\t2159\t1658\t107\t1604\t145\t2407\t131\t2073\t1878\n" +
                    "1845\t91\t1662\t108\t92\t1706\t1815\t1797\t1728\t1150\t1576\t83\t97\t547\t1267\t261\n" +
                    "78\t558\t419\t435\t565\t107\t638\t173\t93\t580\t338\t52\t633\t256\t377\t73\n" +
                    "1143\t3516\t4205\t3523\t148\t401\t3996\t3588\t300\t1117\t2915\t1649\t135\t134\t182\t267\n" +
                    "156\t2760\t1816\t2442\t2985\t990\t2598\t1273\t167\t821\t138\t141\t2761\t2399\t1330\t1276\n" +
                    "3746\t3979\t2989\t161\t4554\t156\t3359\t173\t3319\t192\t3707\t264\t762\t2672\t4423\t2924\n" +
                    "3098\t4309\t4971\t5439\t131\t171\t5544\t595\t154\t571\t4399\t4294\t160\t6201\t4329\t5244\n" +
                    "728\t249\t1728\t305\t2407\t239\t691\t2241\t2545\t1543\t55\t2303\t1020\t753\t193\t1638\n" +
                    "260\t352\t190\t877\t118\t77\t1065\t1105\t1085\t1032\t71\t87\t851\t56\t1161\t667\n" +
                    "1763\t464\t182\t1932\t1209\t640\t545\t931\t1979\t197\t1774\t174\t2074\t1800\t939\t161") input: String
    ): Int {
        println("Input: \n$input")

        return input.split("\n").map { s -> s.split("\t").map { s -> s.toInt() } }.sumBy { list -> (list.max() ?: 0) - (list.min() ?: 0) }
    }


    @ShellMethod("Calculate the answer for Day 2: pt 2")
    fun day02_2(
            @ShellOption(defaultValue = "104\t240\t147\t246\t123\t175\t372\t71\t116\t230\t260\t118\t202\t270\t277\t292\n" +
                    "740\t755\t135\t205\t429\t822\t844\t90\t828\t115\t440\t805\t526\t91\t519\t373\n" +
                    "1630\t991\t1471\t1294\t52\t1566\t50\t1508\t1367\t1489\t55\t547\t342\t512\t323\t51\n" +
                    "1356\t178\t1705\t119\t1609\t1409\t245\t292\t1434\t694\t405\t1692\t247\t193\t1482\t1407\n" +
                    "2235\t3321\t3647\t212\t1402\t3711\t3641\t1287\t2725\t692\t1235\t3100\t123\t144\t104\t101\n" +
                    "1306\t1224\t1238\t186\t751\t734\t1204\t1275\t366\t149\t1114\t166\t1118\t239\t153\t943\n" +
                    "132\t1547\t1564\t512\t2643\t2376\t2324\t2159\t1658\t107\t1604\t145\t2407\t131\t2073\t1878\n" +
                    "1845\t91\t1662\t108\t92\t1706\t1815\t1797\t1728\t1150\t1576\t83\t97\t547\t1267\t261\n" +
                    "78\t558\t419\t435\t565\t107\t638\t173\t93\t580\t338\t52\t633\t256\t377\t73\n" +
                    "1143\t3516\t4205\t3523\t148\t401\t3996\t3588\t300\t1117\t2915\t1649\t135\t134\t182\t267\n" +
                    "156\t2760\t1816\t2442\t2985\t990\t2598\t1273\t167\t821\t138\t141\t2761\t2399\t1330\t1276\n" +
                    "3746\t3979\t2989\t161\t4554\t156\t3359\t173\t3319\t192\t3707\t264\t762\t2672\t4423\t2924\n" +
                    "3098\t4309\t4971\t5439\t131\t171\t5544\t595\t154\t571\t4399\t4294\t160\t6201\t4329\t5244\n" +
                    "728\t249\t1728\t305\t2407\t239\t691\t2241\t2545\t1543\t55\t2303\t1020\t753\t193\t1638\n" +
                    "260\t352\t190\t877\t118\t77\t1065\t1105\t1085\t1032\t71\t87\t851\t56\t1161\t667\n" +
                    "1763\t464\t182\t1932\t1209\t640\t545\t931\t1979\t197\t1774\t174\t2074\t1800\t939\t161") input: String
    ): Int {
        println("Input: \n$input")

        return input.split("\n").map { s -> s.split("\t").map { s -> s.toInt() } }.sumBy { getDivisibleResult(it) }
    }

    fun getDivisibleResult(row: List<Int>): Int {
        row.indices.forEach { i ->
            for (j in (i + 1) until row.size) {
                if (row[i] % row[j] == 0) {
                    return row[i] / row[j]
                } else if (row[j] % row[i] == 0) {
                    return row[j] / row[i]
                }
            }
        }
        return 0 // it's a given that this won't happen
    }

    @ShellMethod("Calculate the answer for Day 3: pt 1")
    fun day03_1(
            @ShellOption(defaultValue = "325489") input: Int
    ): Int {
        println("Input: \n$input")

        // let's rather not struggle with this edge case
        if (input == 1)
            return 0

        val squareRadius = calcSquareRadius(input)
        val perimeterLength = (squareRadius - 1) * 8
        val perimeterStart = (Math.pow((squareRadius - 1) * 2.0 - 1, 2.0) + 1).toInt()
        val anchors = calcAnchors(squareRadius, perimeterStart, perimeterLength)

        return (squareRadius - 1) + (anchors.map { Math.abs(it - input) }.min() ?: 0)
    }


    fun calcSquareRadius(location: Int): Int {
        return ceil((sqrt(location.toDouble()) + 1) / 2).toInt()
    }

    fun calcAnchors(squareRadius: Int, perimeterStart: Int, perimeterLength: Int): List<Int> {
        return (1..4).map { perimeterStart + it * (perimeterLength / 4) - squareRadius }
    }

    @ShellMethod("Calculate the answer for Day 3: pt 2")
    fun day03_2(
            @ShellOption(defaultValue = "325489") input: Int
    ): Int {
        println("Input: \n$input")

        val grid = mutableMapOf<Node, Int>()

        // initialise graph
        var currentDirection = Direction.EAST
        var stepsInDirectionBeforeTurn = 1 // this increases by one after every second turn

        var currentCoords = Node(0, 0)
        grid[currentCoords] = 1

        do {
            main@ for (twoPhaseMovement in 1..2) {
                // take a step in current direction
                for (steps in 1..stepsInDirectionBeforeTurn) {
                    currentCoords = currentCoords.nextCoords(currentDirection)
                    grid[currentCoords] = getNeighbourValues(grid, currentCoords.x, currentCoords.y)

                    if ((grid[currentCoords] ?: Int.MAX_VALUE) > input) {
                        break@main
                    }
                }
                //turn
                currentDirection = currentDirection.getLeftDirection()
            }

            stepsInDirectionBeforeTurn++

        } while ((grid[currentCoords] ?: Int.MAX_VALUE) <= input)

        return grid[currentCoords] ?: 0
    }

    fun getNeighbourValues(grid: MutableMap<Node, Int>, x: Int, y: Int): Int {
        return (grid[Node(x - 1, y - 1)] ?: 0) + (grid[Node(x, y - 1)] ?: 0) + (grid[Node(x + 1, y - 1)] ?: 0) + (grid[Node(x - 1, y)] ?: 0) + (grid[Node(x + 1, y)] ?: 0) + (grid[Node(x - 1, y + 1)] ?: 0) + (grid[Node(x, y + 1)] ?: 0) + (grid[Node(x + 1, y + 1)] ?: 0)
    }

    @ShellMethod("Calculate the answer for Day 4: pt 1")
    fun day04_1(
            @ShellOption(defaultValue = "day04.txt") input: String
    ): Int {

        val file = File(this::class.java.classLoader.getResource(input).file)

        return file.readLines()
                .map { it.split(" ").size == it.split(" ").distinct().size }
                .sumBy { it -> if (it) 1 else 0 }
    }

    @ShellMethod("Calculate the answer for Day 4: pt 2")
    fun day04_2(
            @ShellOption(defaultValue = "day04.txt") input: String
    ): Int {

        val file = File(this::class.java.classLoader.getResource(input).file)

        return file.readLines()
                .map { it.split(" ").size == it.split(" ").map { it.toCharArray().sortedArray().joinToString("") }.toList().distinct().size }
                .sumBy { it -> if (it) 1 else 0 }
    }
}

data class Node(val x: Int, val y: Int) {
    fun nextCoords(direction: Direction): Node {
        return Node(x + direction.deltaX, y + direction.deltaY)
    }
}

enum class Direction {
    NORTH, EAST, SOUTH, WEST;

    private var left: Direction? = null
    var deltaX: Int = 0
    var deltaY: Int = 0

    fun getLeftDirection(): Direction {
        return left ?: this
    }

    companion object {
        init {
            NORTH.left = WEST
            NORTH.deltaY = 1
            EAST.left = NORTH
            EAST.deltaX = 1
            SOUTH.left = EAST
            SOUTH.deltaY = -1
            WEST.left = SOUTH
            WEST.deltaX = -1
        }
    }
}