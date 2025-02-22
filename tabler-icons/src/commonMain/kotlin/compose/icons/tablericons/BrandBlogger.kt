package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandBlogger: ImageVector
    get() {
        if (_brandBlogger != null) {
            return _brandBlogger!!
        }
        _brandBlogger = Builder(name = "BrandBlogger", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 21.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, -5.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 5.0f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 7.0f)
                lineTo(11.5f, 7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.0f, 8.5f)
                lineTo(13.0f, 8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.5f, 10.0f)
                lineTo(8.5f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 8.5f)
                lineTo(7.0f, 8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.5f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 14.0f)
                lineTo(15.5f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.0f, 15.5f)
                lineTo(17.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.5f, 17.0f)
                lineTo(8.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 15.5f)
                lineTo(7.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.5f, 14.0f)
                close()
            }
        }
        .build()
        return _brandBlogger!!
    }

private var _brandBlogger: ImageVector? = null
