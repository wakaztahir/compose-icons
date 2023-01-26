package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.NewLabel: ImageVector
    get() {
        if (_newLabel != null) {
            return _newLabel!!
        }
        _newLabel = Builder(name = "NewLabel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                lineToRelative(0.0f, -4.0f)
                lineToRelative(-3.0f, 0.0f)
                lineToRelative(0.0f, -3.0f)
                lineToRelative(-4.0f, 0.0f)
                lineToRelative(0.0f, -3.0f)
                lineToRelative(10.0f, 0.0f)
                lineToRelative(3.55f, 5.0f)
                lineToRelative(-3.55f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 12.0f)
                lineToRelative(-4.37f, 6.16f)
                curveTo(16.26f, 18.68f, 15.65f, 19.0f, 15.0f, 19.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(0.0f, -2.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(3.55f, -5.0f)
                lineTo(15.0f, 7.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.65f, 0.0f, 1.26f, 0.31f, 1.63f, 0.84f)
                lineTo(21.0f, 12.0f)
                close()
                moveTo(10.0f, 15.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _newLabel!!
    }

private var _newLabel: ImageVector? = null
