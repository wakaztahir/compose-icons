package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup._1k: ImageVector
    get() {
        if (__1k != null) {
            return __1k!!
        }
        __1k = Builder(name = "_1k", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(21.0f, 5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(10.5f, 15.0f)
                lineTo(9.0f, 15.0f)
                verticalLineToRelative(-4.5f)
                lineTo(7.5f, 10.5f)
                lineTo(7.5f, 9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(17.5f, 15.0f)
                horizontalLineToRelative(-1.75f)
                lineTo(14.0f, 12.75f)
                lineTo(14.0f, 15.0f)
                horizontalLineToRelative(-1.5f)
                lineTo(12.5f, 9.0f)
                lineTo(14.0f, 9.0f)
                verticalLineToRelative(2.25f)
                lineTo(15.75f, 9.0f)
                horizontalLineToRelative(1.75f)
                lineToRelative(-2.25f, 3.0f)
                lineToRelative(2.25f, 3.0f)
                close()
            }
        }
        .build()
        return __1k!!
    }

private var __1k: ImageVector? = null
