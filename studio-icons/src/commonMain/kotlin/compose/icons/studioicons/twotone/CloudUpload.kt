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

public val TwotoneGroup.CloudUpload: ImageVector
    get() {
        if (_cloudUpload != null) {
            return _cloudUpload!!
        }
        _cloudUpload = Builder(name = "CloudUpload", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.21f, 12.04f)
                lineToRelative(-1.53f, -0.11f)
                lineToRelative(-0.3f, -1.5f)
                curveTo(16.88f, 7.86f, 14.62f, 6.0f, 12.0f, 6.0f)
                curveTo(9.94f, 6.0f, 8.08f, 7.14f, 7.12f, 8.96f)
                lineToRelative(-0.5f, 0.95f)
                lineToRelative(-1.07f, 0.11f)
                curveTo(3.53f, 10.24f, 2.0f, 11.95f, 2.0f, 14.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.55f, -1.22f, -2.86f, -2.79f, -2.96f)
                close()
                moveTo(13.45f, 13.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.91f)
                verticalLineToRelative(-3.0f)
                lineTo(8.0f, 13.0f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(4.0f, 4.0f)
                horizontalLineToRelative(-2.55f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.35f, 10.04f)
                curveTo(18.67f, 6.59f, 15.64f, 4.0f, 12.0f, 4.0f)
                curveTo(9.11f, 4.0f, 6.6f, 5.64f, 5.35f, 8.04f)
                curveTo(2.34f, 8.36f, 0.0f, 10.91f, 0.0f, 14.0f)
                curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                curveToRelative(0.0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f)
                close()
                moveTo(19.0f, 18.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                curveToRelative(0.0f, -2.05f, 1.53f, -3.76f, 3.56f, -3.97f)
                lineToRelative(1.07f, -0.11f)
                lineToRelative(0.5f, -0.95f)
                curveTo(8.08f, 7.14f, 9.94f, 6.0f, 12.0f, 6.0f)
                curveToRelative(2.62f, 0.0f, 4.88f, 1.86f, 5.39f, 4.43f)
                lineToRelative(0.3f, 1.5f)
                lineToRelative(1.53f, 0.11f)
                curveToRelative(1.56f, 0.1f, 2.78f, 1.41f, 2.78f, 2.96f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(8.0f, 13.0f)
                horizontalLineToRelative(2.55f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.9f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(16.0f)
                lineToRelative(-4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _cloudUpload!!
    }

private var _cloudUpload: ImageVector? = null
