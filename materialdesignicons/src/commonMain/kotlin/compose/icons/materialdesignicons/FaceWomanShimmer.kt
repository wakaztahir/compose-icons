package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.FaceWomanShimmer: ImageVector
    get() {
        if (_faceWomanShimmer != null) {
            return _faceWomanShimmer!!
        }
        _faceWomanShimmer = Builder(name = "FaceWomanShimmer", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 1.0f)
                lineTo(18.41f, 3.41f)
                lineTo(16.0f, 4.5f)
                lineTo(18.41f, 5.59f)
                lineTo(19.5f, 8.0f)
                lineTo(20.6f, 5.59f)
                lineTo(23.0f, 4.5f)
                lineTo(20.6f, 3.41f)
                lineTo(19.5f, 1.0f)
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.0f)
                curveTo(22.0f, 10.53f, 21.67f, 9.13f, 21.1f, 7.87f)
                lineTo(19.86f, 10.59f)
                curveTo(19.94f, 11.05f, 20.0f, 11.5f, 20.0f, 12.0f)
                curveTo(20.0f, 16.43f, 16.43f, 20.0f, 12.0f, 20.0f)
                curveTo(7.57f, 20.0f, 4.0f, 16.43f, 4.0f, 12.0f)
                curveTo(4.0f, 11.96f, 4.0f, 11.91f, 4.0f, 11.87f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 9.74f, 6.31f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 17.5f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 18.83f, 9.91f)
                lineTo(17.35f, 6.65f)
                lineTo(12.6f, 4.5f)
                lineTo(16.13f, 2.9f)
                curveTo(14.87f, 2.33f, 13.47f, 2.0f, 12.0f, 2.0f)
                moveTo(9.0f, 11.75f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 7.75f, 13.0f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 9.0f, 14.25f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 10.25f, 13.0f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 9.0f, 11.75f)
                moveTo(15.0f, 11.75f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 13.75f, 13.0f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 15.0f, 14.25f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 16.25f, 13.0f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 15.0f, 11.75f)
                close()
            }
        }
        .build()
        return _faceWomanShimmer!!
    }

private var _faceWomanShimmer: ImageVector? = null