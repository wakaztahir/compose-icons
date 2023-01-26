package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.DataThresholding: ImageVector
    get() {
        if (_dataThresholding != null) {
            return _dataThresholding!!
        }
        _dataThresholding = Builder(name = "DataThresholding", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                close()
                moveTo(19.0f, 19.0f)
                horizontalLineToRelative(-1.73f)
                lineTo(19.0f, 17.27f)
                verticalLineTo(19.0f)
                close()
                moveTo(19.0f, 16.0f)
                horizontalLineToRelative(-0.85f)
                lineToRelative(-3.0f, 3.0f)
                horizontalLineToRelative(-1.62f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineToRelative(-2.12f)
                lineToRelative(-3.0f, 3.0f)
                horizontalLineTo(9.8f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineToRelative(-2.12f)
                lineToRelative(-3.0f, 3.0f)
                horizontalLineTo(5.84f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineTo(6.72f)
                lineTo(5.0f, 17.72f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.67f, 11.0f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(5.08f, -5.09f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.67f, 3.67f)
                lineToRelative(-2.0f, -2.0f)
                lineToRelative(-4.42f, 4.42f)
                lineToRelative(1.41f, 1.41f)
                close()
            }
        }
        .build()
        return _dataThresholding!!
    }

private var _dataThresholding: ImageVector? = null
