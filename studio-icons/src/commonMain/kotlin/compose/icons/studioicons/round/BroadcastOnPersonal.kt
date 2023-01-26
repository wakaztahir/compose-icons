package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.BroadcastOnPersonal: ImageVector
    get() {
        if (_broadcastOnPersonal != null) {
            return _broadcastOnPersonal!!
        }
        _broadcastOnPersonal = Builder(name = "BroadcastOnPersonal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 8.0f)
                curveToRelative(0.7f, 0.0f, 1.38f, 0.1f, 2.02f, 0.27f)
                lineTo(12.0f, 3.0f)
                lineTo(4.0f, 9.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(6.76f)
                curveTo(9.66f, 19.63f, 9.0f, 17.89f, 9.0f, 16.0f)
                curveTo(9.0f, 11.58f, 12.58f, 8.0f, 17.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 14.75f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                curveToRelative(0.0f, 0.4f, 0.2f, 0.75f, 0.5f, 0.97f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-5.03f)
                curveToRelative(0.3f, -0.23f, 0.5f, -0.57f, 0.5f, -0.97f)
                curveTo(18.25f, 15.31f, 17.69f, 14.75f, 17.0f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 12.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f)
                curveToRelative(0.0f, 1.1f, 0.45f, 2.1f, 1.17f, 2.83f)
                lineToRelative(1.06f, -1.06f)
                curveToRelative(-0.45f, -0.45f, -0.73f, -1.08f, -0.73f, -1.77f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0.0f, 0.69f, -0.28f, 1.31f, -0.73f, 1.76f)
                lineToRelative(1.06f, 1.06f)
                curveTo(20.55f, 18.1f, 21.0f, 17.1f, 21.0f, 16.0f)
                curveTo(21.0f, 13.79f, 19.21f, 12.0f, 17.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 9.5f)
                curveToRelative(-3.59f, 0.0f, -6.5f, 2.91f, -6.5f, 6.5f)
                curveToRelative(0.0f, 1.79f, 0.73f, 3.42f, 1.9f, 4.6f)
                lineToRelative(1.06f, -1.06f)
                curveTo(12.56f, 18.63f, 12.0f, 17.38f, 12.0f, 16.0f)
                curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f)
                curveToRelative(0.0f, 1.37f, -0.56f, 2.62f, -1.46f, 3.52f)
                lineToRelative(1.07f, 1.06f)
                curveToRelative(1.17f, -1.18f, 1.89f, -2.8f, 1.89f, -4.58f)
                curveTo(23.5f, 12.41f, 20.59f, 9.5f, 17.0f, 9.5f)
                close()
            }
        }
        .build()
        return _broadcastOnPersonal!!
    }

private var _broadcastOnPersonal: ImageVector? = null
