package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.TurnSlightRight: ImageVector
    get() {
        if (_turnSlightRight != null) {
            return _turnSlightRight!!
        }
        _turnSlightRight = Builder(name = "TurnSlightRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.34f, 6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(5.66f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(7.41f)
                lineToRelative(-5.0f, 5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-7.58f)
                curveToRelative(0.0f, -0.53f, 0.21f, -1.04f, 0.59f, -1.41f)
                lineToRelative(5.0f, -5.0f)
                horizontalLineTo(12.34f)
                close()
            }
        }
        .build()
        return _turnSlightRight!!
    }

private var _turnSlightRight: ImageVector? = null
