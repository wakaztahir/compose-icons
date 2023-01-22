package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.StarDismiss: ImageVector
    get() {
        if (_starDismiss != null) {
            return _starDismiss!!
        }
        _starDismiss = Builder(name = "StarDismiss", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.7878f, 3.1026f)
                curveTo(11.283f, 2.0993f, 12.7138f, 2.0993f, 13.209f, 3.1026f)
                lineTo(15.567f, 7.8804f)
                lineTo(20.8395f, 8.6465f)
                curveTo(21.9468f, 8.8074f, 22.3889f, 10.1682f, 21.5877f, 10.9492f)
                lineTo(20.6828f, 11.8312f)
                curveTo(19.7421f, 11.3019f, 18.6563f, 11.0f, 17.5f, 11.0f)
                curveTo(13.9101f, 11.0f, 11.0f, 13.9101f, 11.0f, 17.5f)
                curveTo(11.0f, 18.1104f, 11.0841f, 18.7011f, 11.2414f, 19.2612f)
                lineTo(7.2825f, 21.3425f)
                curveTo(6.2921f, 21.8632f, 5.1346f, 21.0222f, 5.3237f, 19.9193f)
                lineTo(6.2244f, 14.6681f)
                lineTo(2.4092f, 10.9492f)
                curveTo(1.6079f, 10.1682f, 2.0501f, 8.8074f, 3.1574f, 8.6465f)
                lineTo(8.4299f, 7.8804f)
                lineTo(10.7878f, 3.1026f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 20.5376f, 20.5376f, 23.0f, 17.5f, 23.0f)
                curveTo(14.4624f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 14.4624f, 12.0f, 17.5f, 12.0f)
                curveTo(20.5376f, 12.0f, 23.0f, 14.4624f, 23.0f, 17.5f)
                close()
                moveTo(15.8536f, 15.1464f)
                curveTo(15.6583f, 14.9512f, 15.3417f, 14.9512f, 15.1464f, 15.1464f)
                curveTo(14.9512f, 15.3417f, 14.9512f, 15.6583f, 15.1464f, 15.8536f)
                lineTo(16.7929f, 17.5f)
                lineTo(15.1464f, 19.1464f)
                curveTo(14.9512f, 19.3417f, 14.9512f, 19.6583f, 15.1464f, 19.8536f)
                curveTo(15.3417f, 20.0488f, 15.6583f, 20.0488f, 15.8536f, 19.8536f)
                lineTo(17.5f, 18.2071f)
                lineTo(19.1464f, 19.8536f)
                curveTo(19.3417f, 20.0488f, 19.6583f, 20.0488f, 19.8536f, 19.8536f)
                curveTo(20.0488f, 19.6583f, 20.0488f, 19.3417f, 19.8536f, 19.1464f)
                lineTo(18.2071f, 17.5f)
                lineTo(19.8536f, 15.8536f)
                curveTo(20.0488f, 15.6583f, 20.0488f, 15.3417f, 19.8536f, 15.1464f)
                curveTo(19.6583f, 14.9512f, 19.3417f, 14.9512f, 19.1464f, 15.1464f)
                lineTo(17.5f, 16.7929f)
                lineTo(15.8536f, 15.1464f)
                close()
            }
        }
        .build()
        return _starDismiss!!
    }

private var _starDismiss: ImageVector? = null